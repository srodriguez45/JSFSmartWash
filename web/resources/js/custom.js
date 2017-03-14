
$(document).ready(function() {
 // executes when HTML-Document is loaded and DOM is ready
 	$('#principal_menu > ul li > a').click( function() {
 		$(".submenu").removeClass('active');
 		$(this).next('.submenu').toggleClass('active');
         //return false;
 	});

 	$('.navToggle').click( function() {
 		$("#principal_menu > ul").toggleClass('mostrar fondo1');
 	});


 	$('.submenu h2').click( function() {
 		$(this).parent('ul').toggleClass('active');
 	});

 	// login 

 	$('input#usuario').change( function() {
 		//localStorage.name = $(this).val();

 		console.log($(this).val());

 	});

 	$('.formulario .input').each( function() {
 		
 		$(this).change( function() {
	 		var name = $(this).attr('name');
	 		var val = $(this).val();
	 		$('#' + name).text(val);
	 	});

 	});


    $('.input[name="nombre"]').change( function() {
            localStorage.name = $(this).val();
    });


		$('#nombre').text(localStorage.name);

		$('input#nombre').val(localStorage.name);
	

 	$('.salir').click(function() {
 		localStorage.clear();
 	}); 

 	//mostrar u ocultar los tipos de clientes
 	$('.list-group-item').click( function() {
 		var link = $(this).attr('data-link');
 		$('.list-group-item').removeClass('active');
 		$(this).addClass('active');
 		console.log(link);
 		$('.bx-table tr').addClass('hide');
 		$('.bx-table tr.' + link).removeClass('hide');
 	});

 	

    //eliminar items de una lista
    $('.remove-item').click( function() {
        var item = $(this).parents('tr').attr('data-id');
        $('.delete-button').attr('delete-id', item);
    });

    //eliminar items de una lista
    $('.delete-button').click( function() {
        var id = $(this).attr('delete-id');
        $('.table tr#row' + id).addClass('hide');
    });

 	//tomar los datos del usuario
  	$('a[href="editCustomer.html"]').click( function() {
 		var name = $(this).attr('data-name');
 		var email = $(this).attr('data-email');
 		var rol = $(this).attr('data-rol');

 		localStorage.clienteName = name;
 		localStorage.clienteEmail = email;
 		localStorage.clienteRol = rol;

 	});

  	//seleccionar todos
 	$('.check_all').click(function() {
 		var check = $(':checkbox');
        if(this.checked) { 
        	check.each(function() { this.checked = true; }); // Iterate each checkbox
        } else { 
        	check.each(function() { this.checked = false; }); 
        }
    });

 	//agregar los datos a los inputs de los clientes
    $('.customer_form input#name').val(localStorage.clienteName);
    $('.customer_form input#email').val(localStorage.clienteEmail);

    //
    $('.tipo a').click( function() {
 		var tipo = $(this).attr('class');
 		$('.tipo a').parents('tr').addClass('hide');
 		$('.' + tipo).parents('tr').removeClass('hide');
 	});


    function get_current_time() {

        var today = new Date();
        var dd = today.getDate();
        var mm = today.getMonth()+1; //January is 0!
        var yyyy = today.getFullYear();

        if(dd<10) {
            dd='0'+dd
        } 

        if(mm<10) {
            mm='0'+mm
        } 

        today = mm+'/'+dd+'/'+yyyy;
        return today;

    }


});


$(window).load(function() {
 // executes when complete page is fully loaded, including all frames, objects and images
});