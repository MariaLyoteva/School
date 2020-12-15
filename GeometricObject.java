package triangle;

public class GeometricObject {
  private String colour = "white";
  private boolean filled;
  private java.util.Date dateCreated;
  
  public GeometricObject() {
	  dateCreated = new java.util.Date();
  }
  
  public GeometricObject(String colour, boolean filled) {
	  dateCreated = new java.util.Date();
	  this.setColour(colour);
	  this.setFilled(filled);
  }

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}

public boolean isFilled() {
	return filled;
}

public void setFilled(boolean filled) {
	this.filled = filled;
}
}
