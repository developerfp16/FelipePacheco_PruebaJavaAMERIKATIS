function eliminar (id){
	swal({
		  title: "¿Estás Seguro de Eliminar?",
		  text: "Una vez Borrado, no se puede recuperar",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			$.ajax ({
				url:"/eliminar/"+id,
				success: function(res){ console.log (res);}
			});
		    swal("¡Ha sido Borrado con Exito!", {
		      icon: "success",
		    }).then((ok)=>{
					if (ok){
						location.href = "/listar"
					}
				});
		  } else {
		    swal("Cancelado!");
		  }
		});		
}

function eliminarmoda (id){
	swal({
		  title: "¿Estás Seguro de Eliminar?",
		  text: "Una vez Borrado, no se puede recuperar",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			$.ajax ({
				url:"/eliminarmoda/"+id,
				success: function(res){ console.log (res);}
			});
		    swal("¡Ha sido Borrado con Exito!", {
		      icon: "success",
		    }).then((ok)=>{
					if (ok){
						location.href = "/listarmodalidades"
					}
				});
		  } else {
		    swal("Cancelado!");
		  }
		});		
}

function eliminardesc (id){
	swal({
		  title: "¿Estás Seguro de Eliminar?",
		  text: "Una vez Borrado, no se puede recuperar",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			$.ajax ({
				url:"/eliminardesc/"+id,
				success: function(res){ console.log (res);}
			});
		    swal("¡Ha sido Borrado con Exito!", {
		      icon: "success",
		    }).then((ok)=>{
					if (ok){
						location.href = "/listardescuento"
					}
				});
		  } else {
		    swal("Cancelado!");
		  }
		});		
}