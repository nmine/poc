//////function Personne(prenom, nom) {
//////        this.type = "Personne";
//////        this.prenom = prenom;
//////        this.nom = nom;
//////}
//////                        
//////Personne.prototype.getType = function() {
//////        return this.type;
//////};
//////                        
//////Personne.prototype.getNomComplet = function() {
//////        return this.prenom + " " + this.nom;
//////};
//////
//////function Etudiant(prenom, nom, session) {
//////        Personne.call(this, prenom, nom);
//////        this.type = "Étudiant session : " + session;
//////}
//////                        
//////Etudiant.prototype = new Personne(); // Héritage se fait ici
//////Etudiant.prototype.constructor = Etudiant;
//////
//////function Enseignant(prenom, nom) {
//////        Personne.call(this, prenom, nom);
//////        this.type = "Enseignant";
//////}
//////                        
//////Enseignant.prototype = new Personne();                  
//////Enseignant.prototype.constructor = Enseignant; 
//////
//////var listePersonnes = new Array();
//////
//////var personne = new Personne("Inconnu", "Inconnu");
//////listePersonnes.push(personne);
//////
//////var etudiant = new Etudiant("Émile", "F.", "Hiver 2012");
//////listePersonnes.push(etudiant);
//////
//////var enseignant = new Enseignant("Frédéric", "Thériault");
//////listePersonnes.push(enseignant);
//////                        
//////for (var i = 0; i < listePersonnes.length; i++) {
//////        console.log(listePersonnes[i].getNomComplet() + "</b> ");
//////        console.log(listePersonnes[i].getType() + "</b> ");
//////}
////
//////function Product(name, price) {
//////  this.name = name;
//////  this.price = price;
////// 
//////  if (price < 0)
//////    throw RangeError('Cannot create product "' + name + '" with a negative price');
//////  return this;
//////}
////// 
//////function Food(name, price) {
//////  Product.call(this, name, price);
//////  this.category = 'food';
//////}
//////Food.prototype = new Product();
//// 
//////function Toy(name, price) {
//////  Product.call(this, name, price);
//////  this.category = 'toy';
//////}
////////Toy.prototype = new Product();
////// 
//////var cheese = new Food('feta', 5);
//////var fun = new Toy('robot', 40);
//////
//////console.log(cheese.category);
//////
//////var animals = [
//////  {species: 'Lion', name: 'King'},
//////  {species: 'Whale', name: 'Fail'}
//////];
////// 
//////for (var i = 0; i < animals.length; i++) {
//////  (function (i) { 
//////    this.print = function () { 
//////      console.log('#' + i  + ' ' + this.species + ': ' + this.name); 
//////    } 
//////    this.print();
//////  }).call(animals[i], i);
//////}
////
////
//////function Pet(name, species){
//////    this.name = name;
//////    this.species = species;
//////    this.view = function view(){
//////    //    return this.name + " is a " + this.species + "!"
//////      console.log(this.name + " is a " + this.species + "!");
//////    };
//////}
//////function view(){
////////    return this.name + " is a " + this.species + "!"
//////      console.log(this.name + " is a " + this.species + "!");
//////}
//////view();
//////Pet.prototype.view = view;
//////var dog = new Pet("toto", "bear");
//////dog.view();
//////function Dog(name){
//////    Pet.call(this, name, "dog");
//////}
//////Dog.prototype = new Pet();
//////Dog.prototype.bark = function(){
//////    alert("Woof!");
//////};
////function Pet(name, species){
////    this.name = name;
////    this.species = species;
////}
////function view(){
////    return this.name + " is a " + this.species + "!";
////}
////Pet.prototype.view = view;
////function Dog(name){
////    Pet.call(this, name, "dog");
////}
////Dog.prototype = new Pet();
////Dog.prototype.bark = function(){
////    console.log("Woof!");
////};
//////work but problems with jplot
//////Object.prototype.testfunction = function() {
//////    console.log("test function output");
//////};
//////var dog = new Dog("toto");
//////console.log(dog.view());
//////var pet1 = new Pet('Trudy', 'Bird');
//////var pet2 = new Dog('Gabriella');
//////console.log(pet2.view()); // Outputs "Gabriella is a Dog!"
//////pet2.bark(); // Outputs "Woof!"
//////pet1.bark(); // Error
//
//var Cat = function (name) {
//this.name = name;
//this.saying = 'meow';
//}.
//inherits(Mammal).
//method('purr', function (n) {
//var i, s = '';
//for (i = 0; i < n; i += 1) {
//if (s) {
//s += '-';
//}       
//s += 'r';
//    }
//    return s;
//}).
//method('get_name', function ( ) {
//    return this.says( ) + ' ' + this.name +' ' + this.says( );
//});

//var healthFollower = {
//  author : "Nicolas Mine",	
// 
//  addEventListener : function(o,typeEvent,callback){
//    if (o.addEventListener){
//      o.addEventListener(typeEvent,callback,false);
//    }
//    else if (o.attachEvent){
//      o.attachEvent("on" + typeEvent,callback);
//    }
//  },
// 
//  displayException : function(){
//    if (arguments.length < 1){
//      // pas de paramètres passés à la fonction
//      return;
//    }
//
//    var exc = arguments[0];
//    if (!(exc instanceof Object) || exc.message === undefined){
//      // le paramètre n'est pas une exception
//      return;
//    }
// 
//    // on affiche toutes les propriétés de l'exception 
//    // (elles diffèrent suivant le navigateur)
//    var msg = "";
//    for (var prop in exc){
//      msg += exc[prop] + "\n";
//    }
//    alert(msg);
//  },
//          
//  healthDataDTO : function healthDataDTO(timeCardio, weigth, date) {
//    this.cardioTime = timeCardio;
//    this.weigth = weigth;
//    this.date = date;
//    this.getInfos = function() {
//        return this.cardioTime;
//    };
//}
  
//};
//
//var healthModule = (function () {
//    var my = {};
//    var healthDataDTO = {
//       cardioTime : '150',
//       weigth : '80',
//       date : '0'
//    }
//    
//    
//    this.getHealthDataDTO_private = function() {
//        return this.healthDataDTO;
//    }
//    
//    my.getHealthDataDTO = function() {
//        return healthDataDTO;
//    }    
//    return my;
//
//}());
//
//var testHD = new healthDataDTO();
////healthDataDTO.testHD.cardioTime_private = 150;
////var t = new healthDataDTO();
//var t2 = healthModule.getHealthDataDTO();
////t2.setDate(3);
////console.log(t.getDate());
//console.log(t2.cardioTime);

//
//function HealthDataDTO(cardioTime,weigth,date){ 
////	this.constructor.population++;
//
//	// ************************************************************************ 
//	// PRIVATE VARIABLES AND FUNCTIONS 
//	// ONLY PRIVELEGED METHODS MAY VIEW/EDIT/INVOKE 
//	// *********************************************************************** 
//	var cardioTime_private = cardioTime;
//        var weigth_private = weigth;
//        var date_private = date;
//        
//	var maxAge=70+Math.round(Math.random()*15)+Math.round(Math.random()*15);
//	function makeOlder(){ return alive = (++age <= maxAge) } 
//
////	var myName=n?n:"John Doe";
//	var weight=1;
//        
//        
//
//
//	// ************************************************************************ 
//	// PRIVILEGED METHODS 
//	// MAY BE INVOKED PUBLICLY AND MAY ACCESS PRIVATE ITEMS 
//	// MAY NOT BE CHANGED; MAY BE REPLACED WITH PUBLIC FLAVORS 
//	// ************************************************************************ 
//	this.toString=this.getName=function(){ return myName } 
//
//	this.eat=function(){ 
//		if (makeOlder()){ 
//			this.dirtFactor++;
//			return weight*=3;
//		} else alert(myName+" can't eat, he's dead!");
//	} 
//	this.exercise=function(){ 
//		if (makeOlder()){ 
//			this.dirtFactor++;
//			return weight/=2;
//		} else alert(myName+" can't exercise, he's dead!");
//	} 
//	this.weigh=function(){ return weight } 
//	this.getRace=function(){ return race } 
//	this.getAge=function(){ return age } 
//	this.muchTimePasses=function(){ age+=50; this.dirtFactor=10; } 
//
//
//	// ************************************************************************ 
//	// PUBLIC PROPERTIES -- ANYONE MAY READ/WRITE 
//	// ************************************************************************ 
//	this.clothing="nothing/naked";
//	this.dirtFactor=0;
//} 
//
//
//// ************************************************************************ 
//// PUBLIC METHODS -- ANYONE MAY READ/WRITE 
//// ************************************************************************ 
//HealthDataDTO.prototype.beCool = function(){ this.clothing="khakis and black shirt" } 
//HealthDataDTO.prototype.shower = function(){ this.dirtFactor=2 } 
//HealthDataDTO.prototype.showLegs = function(){ alert(this+" has "+this.legs+" legs") } 
//HealthDataDTO.prototype.amputate = function(){ this.legs-- } 
//
//
//// ************************************************************************ 
//// PROTOTYOPE PROERTIES -- ANYONE MAY READ/WRITE (but may be overridden) 
//// ************************************************************************ 
//HealthDataDTO.prototype.legs=2;
//
//
//// ************************************************************************ 
//// STATIC PROPERTIES -- ANYONE MAY READ/WRITE 
//// ************************************************************************ 
//HealthDataDTO.population = 0;
//
//var healthData = new HealthDataDTO(5,6,7);
//console.log(healthData.);




//var healthFollower = {
//  author : "Nicolas Mine",	
// 
//  addEventListener : function(o,typeEvent,callback){
//    if (o.addEventListener){
//      o.addEventListener(typeEvent,callback,false);
//    }
//    else if (o.attachEvent){
//      o.attachEvent("on" + typeEvent,callback);
//    }
//  },
// 
//  displayException : function(){
//    if (arguments.length < 1){
//      // pas de paramètres passés à la fonction
//      return;
//    }
//
//    var exc = arguments[0];
//    if (!(exc instanceof Object) || exc.message === undefined){
//      // le paramètre n'est pas une exception
//      return;
//    }
// 
//    // on affiche toutes les propriétés de l'exception 
//    // (elles diffèrent suivant le navigateur)
//    var msg = "";
//    for (var prop in exc){
//      msg += exc[prop] + "\n";
//    }
//    alert(msg);
//  },
//          
//  healthDataDTO : function healthDataDTO(timeCardio, weigth, date) {
//    this.cardioTime = timeCardio;
//    this.weigth = weigth;
//    this.date = date;
//    this.getInfos = function() {
//        return this.cardioTime;
//    };
//}
//  
//};
//
//var testHD = new healthDataDTO(150,5,4);
//console.log(testHD.getInfos());
//var myRevealingModule = function () {
//
//        var privateVar = "Ben Cherry",
//            publicVar  = "Hey there!";
//
//        function privateFunction() {
//            console.log( "Name:" + privateVar );
//        }
//        
//        function publicSetName( strName ) {
//            privateVar = strName; 
//        }
//
//        function publicGetName() {
//            privateFunction(); 
//        }
//
//
//        // Reveal public pointers to  
//        // private functions and properties
//
//        return {
//            setName: publicSetName,
//            greeting: publicVar,
//            getName: publicGetName
//        };
//
//    }();
//
//myRevealingModule.setName( "Paul Kinlan" );
//console.log(myRevealingModule.getName());