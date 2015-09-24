package kr.ac.kookmin.shape;

public class Ellipse extends Shape{
	
	private int h;
	private int w;
	
	public Ellipse(Point point , int k, int l){
		w = k;
		h = l;
		this.center = point;
	}

    public Rectangle getBounds(){
    	return new Rectangle(center, w*2, h*2);
    }

    @Override
    public void draw(Graphics g) {
    	g.draw(this);
    }
    @Override
    public String toString() {
    	return "Ellipse";
    }

	@Override
	public Point getCenter() {
		return this.center;
	}
}
