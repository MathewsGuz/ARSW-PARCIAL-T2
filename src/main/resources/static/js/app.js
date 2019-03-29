/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var ControllerModule=(function(){

	metodoRest=function(datos){
		datos2=datos;
		var tabla= $('#temps');
		var html;
		html =' <tr style="border: 1px solid black"> <th colspan="2">Cinema</th> </tr>	<tr style="border: 1px solid black">'
		tabla.empty();
		if(datos!=null){			
			html+='<tr>'+"\n  <td>"+datos.name+"</td>"+"\n	<td>"+datos.temp+"</td>"+"\n   <td>"+datos.pressure+"</td>"+"\n <td>"+datos.humidity+"</td>"+'\n</tr>';		    
		}else{
			alert("ciudad no encontrada");
		}	
		tabla.append(html);

	};





	return {		
		
		metodoNombreREST:function (){
			var name= $('#name').val();
			clienteRest.getCinemaByName(name,metodoRest);
		}	
	}
})();
