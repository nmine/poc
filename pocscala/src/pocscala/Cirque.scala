package pocscala

object Cirque {
	class Animal(val nom: String, var dresse: Boolean = false) {
	  def seDeplacer = "Je me Déplace"
	  def dresser = {
	    dresse = true
	    "J'ai été dressé !!"
	  }
	  def afficher = println("Je suis un animal, je m'appelle " + nom + " et " + seDeplacer)
	  def test(t:Boolean) = {
	    true
	  }
	}
	
	class Chien(val nom: String, var dresse: Boolean = false) {
	  def seDeplacer = "Je marche"
	  def dresser = {
	    dresse = true
	    println("J'ai été dressé !!")
	  }
	  def afficher = println("Je suis un chien, je m'appelle " + nom + " et " + seDeplacer)
	}
	 
	class Serpent(val nom: String, var dresse: Boolean = false) {
	  def seDeplacer = "Je glisse"
	  def dresser = {
	    dresse = true
	    println("J'ai été dressé !!")
	  }
	  def afficher = println("Je suis un serpent, je m'appelle " + nom + " et " + seDeplacer)
	}
	 
	class Poisson(val nom: String, var dresse: Boolean = false) {
	  def seDeplacer = "Je nage"
	  def dresser = {
	    dresse = true
	    println("J'ai été dressé !!")
	  }
	  def afficher = println("Je suis un poisson, je m'appelle " + nom + " et " + seDeplacer)
	}
	 
	object Jojo {
	  def dresser(a: Chien) = a.dresser
	  def dresser(a: Serpent) = a.dresser
  	  def dresser(a: Poisson) = a.dresser	
	}
	
	def main(args: Array[String]) {
//		var animal = new Animal("toto")
//		print(animal.dresse)
//		animal.dresser
//		print(animal.dresse)
	  val chien = new Chien("Bobby")
	  val serpent = new Serpent("Tika")
	  chien.afficher
	  Jojo.dresser(serpent)
	  serpent.afficher
	}
}