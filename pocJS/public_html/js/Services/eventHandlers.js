/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(function() {
     //separattion by a ',' to add several selectors
    //do the job of the 'find' methode of jQuery by a switch case.
    
    $(".hero-unit").on('click', 'input, button' , function(event) {
        console.log(event.target);
        var target = event.target;
        console.log(target.tagName);
        switch(target.tagName) {
            case ('INPUT') :
                alert('click event on HTMLInputElement tag');
                break;
            case ('BUTTON') :
                alert('click event on HTMLButtonElement tag');
                break;
            default :
                break;
        }
    });
});

