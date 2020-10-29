package packageArrays;
import java.util.Scanner;
public class Randomiser {

	public static void main(String[] args) {
	int[]	array =new int[10];
	Scanner input = new Scanner(System.in);
	for (int i =0; i<10; i++) {
		array[i]= input.nextInt();
	}
	for (int i =0; i<10; i++) {
		int rIndex = (int)(Math.random()*10);
		int swap = array[rIndex];
		array[rIndex]=array[i];
		array[i]=swap;
	}
	for (int i =0; i<10; i++) {
		System.out.println(array[i]);
	}
	}

}
