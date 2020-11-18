package Fan;

public class Fan {
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed = this.SLOW;
	private boolean switchedOn = false;
	private double radius = 5.0;
	private String colour = "blue";
	void setSpeed(int newSpeed) {
		this.speed = newSpeed;
	}
	void setSwithedOn(boolean OnOff) {
		this.switchedOn = OnOff;
	}
	void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	void setColour(String newColour) {
		this.colour = newColour; 
	}
	int getSpeed() {
		return this.speed;
	}
	boolean getSwithedOn() {
		return this.switchedOn;
	}
	double getRadius() {
		return this.radius;
	}
	String getColour() {
		return this.colour;
	}
	String goToString() {
		String speed1 = Integer.toString(speed);
		String radius1 = Double.toString(radius);
		if (switchedOn == true) {
			return ("Speed is " + speed1 + ". Radius is " + radius1 + ". Colour is " + colour); 
		}else {
			return ("Its switched off. Radius is " + radius1 + ". Colour is " + colour); 
		}
	}
	Fan(){
	
	}
	
}
