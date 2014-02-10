/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


var proto = {
    hello : function hello() {
        return 'Herllo, my name is '+ this.name;
    }
};
var object2 = {
  banana: {price: 200},
  durian: 100
};

var test = {};
//ok
$.extend(test, object2);

var model = function() {
    var attrs = {};
    
    this.set = function(name, value) {
        attrs[name] = value;
    };
    
    this.get = function(name) {
        return attrs[name];
    };
    
};
//model.set('name', 'george');
//alert(model.get('name'));