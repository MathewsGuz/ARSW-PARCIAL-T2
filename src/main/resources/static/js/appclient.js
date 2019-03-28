clienteRest=(function(){

	return {
		getCityByName:function(name,callback){
			$.getJSON( "/weather/"+name, function( data ) {				
				callback(data);				
			});

		},
	
	}


})();