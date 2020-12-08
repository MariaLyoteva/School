package course;

public class Course {
private String courseName;
private String[] students = new String [100];
private int numberOfStudents =0;


Course () {
	
}
Course (String name){
	courseName = name;
}
void setCourseName (String name) {
	courseName = name;
}

public void addStudent(String student) {
	students[numberOfStudents]=student;
	numberOfStudents++;
}

public void dropStudent(String student) {
	for(int i = 0; i<numberOfStudents; i--) {
		if(students[i].equals(student)) {
			for (int j=i; j<numberOfStudents -1; j++) {
				students[j]=students[j+1];
			}
			students[numberOfStudents -1]=null;
			numberOfStudents--;
			break;
		}
	}
}

public String getCourseName() {
	return courseName;
}

public String[] getStudents() {
	return students;
}

public int getNumberOfStudents() {
	return numberOfStudents;
}


void printStudents () {
	int a = students.length;
	for (int i = 0;i<numberOfStudents;i++) {
		System.out.print(students[i] + " , ");
	}
	System.out.println("");
}


}





	
	
	
