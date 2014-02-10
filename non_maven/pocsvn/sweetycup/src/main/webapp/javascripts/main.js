    $(document).ready(function() {
      
      $('#formDetails').submit(function(event) {
    	  
    	  var name = $('#personName').val();
    	  var email = $('#personEmail').val();
    	  var pseudo = $('#personPseudo').val();
    	  
        $.ajax({
        	url: $("#formDetails").attr("action"),
        	data: "name=" + name + "&email=" + email+ "&pseudo=" + pseudo,
        	type: "POST",
        	success: function(smartphone) {
        		var respContent = "";
        		
		  		respContent += "<span class='success'>Smartphone was created: [";
		  		respContent += smartphone.producer + " : ";
		  		respContent += smartphone.model + " : " ;
		  		respContent += smartphone.price + "]</span>";
        		
        		$("#tablePerson").html(respContent);   		
        	}
        });
         
        event.preventDefault();
      });

      $('#comment').submit(function(event) {
    	  
    	  var pseudo = $('#articlePseudo').val();
    	  var email = $('#articleEmail').val();
    	  var content = $('#articleContent').val();
    	  var comment = new Object();
    	  comment.pseudo = pseudo;
    	  comment.email = email;
    	  comment.content = content;
//    	  var json = { "name" : name, "email" : email, "content": content};
    	  $.ajax({
    		  url: $("#comment").attr("action"),
    		  dataType : 'json',
    		  data: JSON.stringify(comment),
    		  contentType : 'application/json',
    		  type: "POST",
    		  success: function(smartphone) {
    			  var respContent = "";
    			  
    			  respContent += "<span class='success'>Smartphone was created: [";
    			  respContent += smartphone.producer + " : ";
    			  respContent += smartphone.model + " : " ;
    			  respContent += smartphone.price + "]</span>";
    			  
    			  $("#tablePerson").html(respContent);   		
    		  }
    	  });
    	  
    	  event.preventDefault();
      });
       
    });
