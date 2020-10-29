package packageArrays;

		class Circle {
			public double radius;
			
			public Circle(double newRadius) {
				radius = newRadius;
			}
			
			double getArea() {
				double area = Math.PI * Math.pow(radius, 2);
				return area;
			}
			double getPerimeter() {
				double perimeter = 2*Math.PI*radius;
				return perimeter;
			}
			void setRadius(double newRadius) {
				radius = newRadius;
			}
		}

		public class Circle10{

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				Circle c1 = new Circle(10);
				System.out.println("Radius is: " + c1.radius + " Perimeter is: " + c1.getPerimeter() + " Area is: " + c1.getArea()); 
				Circle c2 = new Circle(5);
				System.out.println("Radius is: " + c2.radius + " Perimeter is: " + c2.getPerimeter() + " Area is: " + c2.getArea());
				Circle c3 = new Circle(25);
				System.out.println("Radius is: " + c3.radius + " Perimeter is: " + c3.getPerimeter() + " Area is: " + c3.getArea());
				c1.setRadius(15);
			}
			}
