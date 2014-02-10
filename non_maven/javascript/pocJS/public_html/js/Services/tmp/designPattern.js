var object = new Object();
var object1 = {};
var object2 = Object.create(null);
//var test = function() {
//    return "return of test function";
//};
object["firstName"] = "Nicolas";
//object["key2"] = test;
var firstName = object["firstName"];

Object.defineProperties( object, {"someKey": { 
    value: "Hello World",
    writable: true 
  },

  "anotherKey": { 
    value: "Foo bar", 
    writable: false   
   } 
});

//function class-like with prototype
function Car( model, year, miles ) {
  this.model = model;
  this.year = year;
  this.miles = miles;
}
// Note here that we are using Object.prototype.newMethod rather than
// Object.prototype so as to avoid redefining the prototype object
Car.prototype.toString = function () {
  return this.model + " has done " + this.miles + " miles";
};
// Usage:

 

var civic = new Car( "Honda Civic", 2009, 20000 );

var mondeo = new Car( "Ford Mondeo", 2010, 5000 );

 

//alert( civic.toString() );

//alert( mondeo.toString() );


//console.log(object["someKey"].value);

