document.addEventListener("DOMContentLoaded", () => {
    /*
    document representa todo el documento HTML 
    ES NECESARIO CADA QUE SE USA <script> EN EL HEAD DEL HTML (O SEA SE LIGA UN ARCHIVO CON OTRO)

    .addEventListener(...) significa "agregar un escuchador de eventos". Le dice al navegador
    que esté atento a que suceda algo específico para ejecutar una orden

    "DOMContentLoaded": Es el evento exacto que está esperando. Significa que el HTML ya se leyó y los 
    elementos ya están listos en la memoria del navegador

    () => { ... } es una función de flecha que contiene el código que solo se va a ejecutar en el preciso instante en que ocurra ese evento de carga.
    
    */

    const formulario = document.getElementById("form-signos"); //asegurar que sea el mismo id en el html
    if (formulario){
        /*
        formulario es la variable que representa a la variable de la pagina html
        addEventListener hace que el navegador se quede vigilando el formulario y avisa cuando ocurra algo
        submit es el evento específico que queremos vigilar. Ocurre exactamente en el momento en que el usuario intenta enviar el formulario.

        function (event) { ... }: Es la función que se ejecutará automáticamente justo en ese instante, es decir, cuando el usuario le dé al botón de enviar.
        */ 
        formulario.addEventListener("submit", function (event) {
            event.preventDefault();

            const temperatura = parseFloat(document.getElementById("temperatura").value);
            const pas = parseFloat(document.getElementById("pas").value);



        }


    }
    
   



});