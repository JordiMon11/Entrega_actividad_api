$(document).ready(function () {
    $('.toggle-desc').click(function () {
        $(this).siblings('.descripcion').fadeToggle();
        $(this).text(function(i, text){
            return text === "Mostrar descripción" ? "Ocultar descripción" : "Mostrar descripción";
        });
    });
});
