function validarYCalcularSignos() {
    // 1.se leen los valores de las cajas de texto
    let temp = parseFloat(document.getElementById("input-temp").value);
    let pas = parseFloat(document.getElementById("input-pas").value);
    let pad = parseFloat(document.getElementById("input-pad").value);
    let fc = parseFloat(document.getElementById("input-fc").value);

    // 2- verificacion de signos vitales validos
    if (temp < 30 || temp > 45) {
        alert("La temperatura ingresada no es válida (debe ser entre 30°C y 45°C).");
        return false; 
    }

    if (pas < 50 || pas > 260 || pad < 30 || pad > 150) {
        alert("Los valores de presión arterial están fuera de rangos viables.");
        return false;
    }

    if (fc < 30 || fc > 220) {
        alert("La frecuencia cardíaca ingresada es anómala (debe estar entre 30 y 220).");
        return false;
    }

    // 3. si pasa todas las verificaciones se hace el cálculo de la presion arterial media
    let pam = ((2 * pad) + pas) / 3;

    // 4. se evalua el rango de normalidad los resultados en variables llamadas estado para no perderlos
    let estadoTemp = (temp < 36.5) ? "Hipotermia" : (temp <= 37.5 ? "Normal" : "Fiebre");
    let estadoFC = (fc < 60) ? "Bradicardia" : (fc <= 100 ? "Normal" : "Taquicardia");
    let estadoPAM = (pam < 70) ? "Baja / Riesgo" : (pam <= 100 ? "Normal" : "Elevada");

    // 5. mandamos los resultados de los estados en el html
    /*las llaves ${ } dentro de unas comillas invertidas (`), se llaman interpolación de cadenas 
    o simplemente insertar variables dentro de un texto

    todo lo que un input muestra en su cajita se guarda en una propiedad interna llamada value
    
    */
    document.getElementById("txt-temp").value = `${temp} °C (${estadoTemp})`;
    document.getElementById("txt-pam").value = `${pam.toFixed(2)} mmHg (${estadoPAM})`;
    document.getElementById("txt-fc").value = `${fc} lpm (${estadoFC})`;

    // 6. retornamos false para que la pagina no se recargue 
    return false;
}