package kr.ac.kookmin.shape;

public class Rectangle extends Shape{
	//Implement here
	
	private int h;
	private int w;
	
	public Rectangle(Point point , int k, int l){
		w = k;
		h = l;
		this.center = point;
		
	}
	
	public Rectangle getBounds() {
		return this;
	}
	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	@Override
	public String toString() {
		return "Rectangle";
	}

	@Override
	public Point getCenter() {
		return this.center;
		
	}

	public int getWidth() {
		return w;
	}

	public int getHeight() {
		// TODO Auto-generated method stub
		return h;
	}
}
