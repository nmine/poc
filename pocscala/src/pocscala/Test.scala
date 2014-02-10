package pocscala

object Test {

class Zero {
	     var pseudo = "Anonyme"
	     var age = 0
	     var citation = "Aucune citation"
	     var affichage = "Pseudo: " + pseudo +" Age: " + age + " Citation: " + citation
	     def avancerAge(n: Int) = age +=n
	}
	
	class Calculatrice {
		  def somme2(x: Int, y: Int):Unit = x + y
		  def somme3(x: Int, y: Int, z: Int) = x + y + z
	}
	
	
	def main(args: Array[String]) {
		val c = new Calculatrice
		c.somme2(5, 6)
		var x: Int = 5
		c.somme2(x, 2 * x)
		x= c.somme3(1, 8, x)
		print(x)
	}
}