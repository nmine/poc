package be.nmine.chained;

public class Rectangle extends ChainedRectangle {
	public Rectangle() {
		
	}
	public static void main(String[] args) {
		ChainedRectangle rectangle = new ChainedRectangle()
			.setColor("blue")
			.setX(5)
			.setY(5);
			
	}
}
