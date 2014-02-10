package pocscala
//Scope is a singelton , the unique instance of the Object Scope 
object Scope {
  
	class Personne(private val _nom: String, private var _age: Int) { // vous comprendrez plus tard pourquoi ce changement de noms
//	  var nom = _nom
	  def nom = _nom
	  
	  def age = _age
//	  var age = _age
	  def age_=(age1: Int) = { if (age1 > 0) _age = age1 } 
	}
	 
	  def main(args: Array[String]) {
	    var person = new Personne("toto",1)
	    println(person.age)
	    person.age = 5
	    print(person.age)
	}
}