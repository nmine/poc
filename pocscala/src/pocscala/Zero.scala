package pocscala

object Zero {
  
  class Zero {
	  var pseudo = "Anonyme"
	  var age = 0
	  var nom = "";
	  var citation = "Aucune citation"
	  def afficher = println("Nom: " + nom + " Age: " + age + " Citation:" + citation)
	  def avancerAge = age += 1
	  var msg = "Aucun Message"
	  def afficherMessage = println(msg)
	  def envoyerMessage(nouveauMsg: String, z: Zero) = {z.msg = "nouveauMessage"}
  }
  def apply(nom: String, age: Int, citation: String = "Aucune citation") = { // l'argument citation est facultatif, on lui donne donc une valeur par défaut
    val resultat = new Zero
    resultat.nom = nom
    resultat.age = age
    resultat.citation = citation
    resultat // ou return resultat
  }
  
  def main(args: Array[String]) {
    //apply est facultatif , inference
	  var zero = Zero("toto", 5)
	  Console.print(zero.nom)
  }
  
  
}