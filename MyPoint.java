package myPoint;

public class MyPoint {

	private double x;
	private double y;
	
	//Constructors
	MyPoint(){
		this.x =0.0;
		this.y=0.0;
	}
	
	MyPoint(double x, double y){
	this.x=x; //setX(x);
	this.y=y;//setY(y);
	}
	
	//Setters and Getters
	public double getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

    public double distance(MyPoint n) {
	return  this.distance(n.getX(), n.getY());
    }
    
    public double distance(double x, double y) {
	return Math.sqrt((this.x-x)*(this.x-x) + (this.y - y)*(this.y - y));
    }
    
    public double distance(MyPoint n, MyPoint m) {
	return n.distance(m.x, m.y);
    }
    

}
