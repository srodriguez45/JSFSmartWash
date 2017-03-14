
var login = $('.login_form');
var obligatorio = "Campo obligatorio";

$(document).ready(function($) {
  
    login.validate({
        
        debug: false,
        errorClass: "text-danger alert-form",
        errorLabelContainer: "#errorLabel",
        errorContainer: "#errorContainer",
        wrapper: "span",
        rules: {

              name : {
                minlength : 5,
                maxlength: { param : 20 }

              },

              password: {
                minlength : 4,
              }

        },
        
        messages: {

            name : {
               required: obligatorio,
               minlength: "{4} caracteres mínimo"
            },

            password: {
               required: obligatorio,
               minlength: "{0} caracteres mínimo"
            }
        },


        submitHandler: function() { 
            
              console.log('hola');

                usuario = $('#name').val();
                password = $('#password').val();
                console.log(usuario + ',' + password);
                if(usuario == 'admin' && password == '1234'){
                  localStorage.setItem("userLoged","Administrador");
                  console.log(usuario + ',' + password);  
                  window.location.href   = 'index.xhtml'
                }if(usuario == 'operador' && password == '1234'){
                  localStorage.setItem("userLoged", "Operador");
                  console.log(usuario + ',' + password);  
                  window.location.href   = 'indexOper.html'
                  // $('#login_form').attr('action','indexOper.html');
                  //$('#login_form').submit();
                }else if(usuario == 'cliente' && password == '1234'){
                  localStorage.setItem("userLoged", "Cliente");
                  window.location.href   = 'indexClient.html'
                  //localStorage["userLoged"] = $("#name").val();
                  // $('#login_form').attr('action','indexClient.html');
                  //$('#login_form').submit();
                }
                else{
                  //alert('usuario invalido');
                  $("#alertaLogin").modal("show");

                }

               


        },

    });

});

