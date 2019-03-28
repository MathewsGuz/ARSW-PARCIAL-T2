/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var ControllerModule=(function(){

	metodoRest=function(datos){
		datos2=datos;
		var tabla= $('#Cine');
		var html;
		html =' <tr style="border: 1px solid black"> <th colspan="2">Cinema</th> </tr>	<tr style="border: 1px solid black">'
		html+='<th>Name</th>	<th>NumFunciones</th> </tr>'
		tabla.empty();
		if(datos!=null){			
			html+='<tr>'+"\n	<td>"+datos.name+"</td>"+"\n	<td>"+datos.functions.length+"</td>"+'\n</tr>';		    
		}else{
			alert("cine no encontrado");
		}	
		tabla.append(html);



		var tabla2=$('#funcion');
		html='<tr style="border: 1px solid black"> <th colspan="4">Funciones</th></tr><tr><th>Name</th>	<th>genero</th>	<th>asientos</th><th>fechas</th> </tr>';
		tabla2.empty();
		tabla2.append(html);
		if(datos!=null){
			var funciones=datos.functions;				

			for(var i =0;i<funciones.length;i++){
				var asientos=funciones[i].seats.length*funciones[i].seats[1].length;
				html='<tr>';
				html+='<td><input type="checkbox" value='+String(funciones[i].movie.name)+'>'+funciones[i].movie.name+' <span class="checkmark"></span> </input></td>';
				html+='<td>'+funciones[i].movie.genre + '</td>';
				html+='<td>'+asientos + '</td>';
				html+='<td>'+funciones[i].date + '</td>';
				html+='</tr>'
					tabla2.append(html);										
			}				
		}	 
		 

	};





	return {		
		
		metodoNombreREST:function (){
			var cine= $('#cine').val();
			clienteRest.getCinemaByName(cine,metodoRest);
		}	
	}
})();
