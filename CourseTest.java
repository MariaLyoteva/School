package course;

public class CourseTest {
    public static void main(String[] args) {
            Course c = new Course();
    		c.addStudent("Peter Anastassov");
    		c.addStudent("Kim Smith");
    		c.printStudents();
    		c.dropStudent("Peter Anastassov");
    		c.printStudents();
    		c.setCourseName("Data structures");
    		
    		System.out.println(c.getNumberOfStudents());
    	}

}


