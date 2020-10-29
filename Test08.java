package packageArrays;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		final int NUM_STUDENTS = 3;
		final int NUM_Q = 3;
		char answers[][] = new char[NUM_STUDENTS][NUM_Q];
		char[] keys = new char[NUM_Q];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < NUM_Q; i++) {
			System.out.println("Enter answer for Question " + (i + 1));
			keys[i] = input.nextLine().charAt(0);
		//	System.out.println();
		}
		System.out.println();
		for (int i = 0; i < NUM_STUDENTS; i++) {
			for (int j = 0; j < NUM_Q; j++) {
				System.out.println("Enter answer for question " + (j + 1) + " for student " + (i + 1));
				answers[i][j] = input.nextLine().charAt(0);
				System.out.println();
			}
		}
		input.close();

		for (int i = 0; i < NUM_STUDENTS; i++) {
			int correctCounter = 0;
			for (int j = 0; j < NUM_Q; j++) {
				if (answers[i][j] == keys[j]) {
					correctCounter++;
				}
				System.out.println("Student " + (i+1) + "'s correct count is " + correctCounter);
				System.out.println();
			}
		}
	}

}
