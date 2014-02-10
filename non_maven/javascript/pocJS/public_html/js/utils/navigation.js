/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

$(function() {
    $("#heigth_panel").hide();
    
    $(".container ul.nav").bind('click', ' li a', function(event) { 
        switch(event.target.text.toLowerCase()) {
        case ('home') :
            setActiveTitle('home');
            break;
        case ('heigth') :
            setActiveTitle('heigth');
            break;
        case ('services') :
            setActiveTitle('services');
            break;
        case ('downloads') :
            setActiveTitle('downloads');
            break;
        case ('about') :
            setActiveTitle('about');
            break;
        case ('contact') :
            setActiveTitle('contact');
            break;
        default :
            break;
        }
    });
    
    function setActiveTitle(titleToActive) {
        //set the the correct style to the li menu headers according to the menu headers item clicked
        $('.container ul.nav li a').each(function(index, element) {
            switchActiveStyle(index, element,titleToActive);        
        });
        displayOrHideScreen(titleToActive, true);
    }
    
//    add and remove the class active to the list header (li) in order to enable/disable title header menu
    function switchActiveStyle(index, element,titleToActive) {
        if($(element).parent().hasClass('active')) {
            $(element).parent().removeClass('active');
            switch($(element).parent().text().toLowerCase()) {
            case ('home') :
                $('#home_panel').hide();
                break;
            case ('heigth') :
                $('#heigth_panel').hide();
                break;
            case ('services') :
                setActiveTitle('services');
                break;
            case ('downloads') :
                setActiveTitle('downloads');
                break;
            case ('about') :
                setActiveTitle('about');
                break;
            case ('contact') :
                setActiveTitle('contact');
                break;
            default :
                break;
            }
        }
        if(element.text.toLowerCase() === titleToActive) 
            $(this).parent().addClass('active');
    }
    
    function displayOrHideScreen(screenNameToodify, show) {
        switch(screenNameToodify) {
        case ('home') :
                $('#header_menu_home_item').addClass('active');
                $('#home_panel').show();
            break;
        case ('heigth') :
                $('#header_menu_height_item').addClass('active');
                $('#heigth_panel').show();
            break;
        case ('services') :
            if(show) {
                $('#home_panel').show();
            }else {
                $('#home_panel').hide();
            }
            break;
        case ('downloads') :
            if(show) {
                $('#home_panel').show();
            }else {
                $('#home_panel').hide();
            }
            break;
        case ('about') :
            setActiveTitle('about');
            break;
        case ('contact') :
            if(show) {
                $('#home_panel').show();
            }else {
                $('#home_panel').hide();
            }
            break;
        default :
            break;
        }
    }
});