/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//function class style
function Apple (type) {
    this.type = type;
    this.color = "red";
    this.getInfo = function() {
      return this.type + " " + this.color;  
    };
}
//define method via the proptotype
Apple.prototype.getInfoByDefineViaPrototype = function() {
  return this.type;  
};

var apple = new Apple("blue");
//alert(apple.getInfoByDefineViaPrototype());

//javascript object (not class style)
var person = {
    firstName : "Nicolas",
    lastName : "mine",
    getInfos : function() {
        return this.firstName + " " + this.lastName;
    }    
};

//singleton
var apple2 = new function() {
    this.type = "macintosh";
    this.color = "red";
    this.getInfo = function () {
        return this.color + ' ' + this.type + ' apple';
    };
};







