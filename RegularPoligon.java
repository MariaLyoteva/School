package regularPoligon;

public class RegularPolygon {
	private int brojStrani = 3;
	private int dyljinaStrana = 1;
	private double x = 0;
	private double y = 0;
	RegularPolygon() {
		
	}
	RegularPolygon(int str, int dylv){
		this.brojStrani = str;
		this.dyljinaStrana = dylv;
	}
	RegularPolygon(int str, int dylv, double xx, double yy) {
		this.brojStrani = str;
		this.dyljinaStrana = dylv;
		this.y = yy;
		this.x = xx;
	}
	void setBrojStrani(int newBrojStrani) {
		this.brojStrani = newBrojStrani;
	}
	void setDyljinaStrana(int newDylvinaStrana) {
		this.dyljinaStrana = newDylvinaStrana;
	}
	void setX(int xx) {
		this.x = xx;
	}
	void setY(int yy) {
		this.y = yy;
	}
	int getBrojStrani() {
		return this.brojStrani;
	}
	int getDylvinaStrana() {
		return this.dyljinaStrana;
	}
	double getX() {
		return this.x;
	}
	double getY() {
		return this.y;
	}
	int getPerimeter() {
		return brojStrani*dyljinaStrana;
	}
	double getArea() {
		double a = Math.toRadians(180/brojStrani);
		return (brojStrani*dyljinaStrana*dyljinaStrana)/(4*Math.tan(a));
	}
}
