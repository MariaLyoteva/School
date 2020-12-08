package smg;

public class Project13ex2 {
	public static void main(String[] args) {
		RegularPolygon pol1 = new RegularPolygon();
		RegularPolygon pol2 = new RegularPolygon(6,4);
		RegularPolygon pol3 = new RegularPolygon(10,4,5.6,7.8);
		RegularPolygon tr = new RegularPolygon(3,2);
		displayPolygon(pol1);
		displayPolygon(pol2);
		displayPolygon(pol3);
	}
	static void displayPolygon(RegularPolygon pol) {
		System.out.println("Îáèêîëêàòà íà ïðàâèëåí ïîëèãîí 1 å: "  + pol.getPerimeter() + ". Ïëîùòòà å: " + pol.getArea() + ".");
	}
}
