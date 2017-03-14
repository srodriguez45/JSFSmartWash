
var login = $('#validate');
var create = $('#createForm');

var obligatorio = "Campo obligatorio";


//validamos si existe el formulario 
if(typeof login.attr('id') != 'undefined') {

    // validation forms    
jQuery(function ($) {
    
            login.validate({
                
                debug: false,
                errorClass: "text-danger alert-form",
                errorLabelContainer: "#errorLabel",
                errorContainer: "#errorContainer",
                wrapper: "span",
                rules: {

                      nombre : {
                        minlength : 5,
                        maxlength: { param : 20 }

                      },

                      contrasena: {
                        minlength : 5,
                      }

                },
                
                messages: {

                    nombre : {
                       required: obligatorio,
                    },

                    contrasena: {
                       required: obligatorio,
                       minlength: "{0} caracteres mínimo"
                    }
                },


                submitHandler: function() { 
                    form.submit();
                },

            });

            /*$('input').rules('add', {
                required: true,
            });*/

});

} else if(typeof create.attr('id') != 'undefined') {

    create.validate({
        
        debug: false,
        errorClass: "text-danger alert-form",
        errorLabelContainer: "#errorLabel",
        errorContainer: "#errorContainer",
        wrapper: "span",
        rules: {

              nombre : {
                minlength : 3,
                maxlength: { param : 20 }
              },

              identificacion: {
                minlength : 9,
                number : true
              },

              email: {
                minlength : 5,
                email : true
              },

              telefono : {
                minlength : 7,
                number : true                
              }

        },
                
        messages: {

            nombre : {
               minlength: "Ingresa mínimo {0} caracteres",
               required : obligatorio
            },

            identificacion : {
               minlength: "Ingresa un documento válido",
               required : obligatorio
            },

            email : {
               minlength : "Ingresa un correo electrónico válido",
               email: "Ingresa un correo electrónico válido",
               required : obligatorio
            },

            telefono : {
               minlength: "Debes tener mínimo {0} caracteres",
               number : "Ingresa únicamente números",
               required : obligatorio
            },

            nombre : {
               minlength: "Ingresa mínimo {0} caracteres",
               required : obligatorio
            },

        },

        submitHandler: function() { 
            //form.submit();
            console.log('probando');
        }

    });

    //regla required para todos los inputs
    $('.icon_form .input').rules('add', {
            required: true,
            messages: {
                required: "Campo obligatorio!"
            }
    });


} else {

    console.log('ningun formulario por validar');

}

