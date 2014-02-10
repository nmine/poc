package be.nmine.chained;

public class ChainedRectangle {
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected String color;

	public ChainedRectangle setX(int x) {
		this.x = x;
		return this;
	}

	public ChainedRectangle setY(int y) {
		this.y = y;
		return this;
	}

	public ChainedRectangle setWidth(int width) {
		this.width = width;
		return this;
	}

	public ChainedRectangle setHeight(int height) {
		this.height = height;
		return this;
	}

	public ChainedRectangle setColor(String color) {
		this.color = color;
		return this;
	}
}
