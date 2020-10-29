package packageArrays;

import java.util.Scanner;

public class Transposed {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Rows:");
		int rawSize = input.nextInt();
		System.out.println("Columns:");
		int colSize = input.nextInt();
		int[][] matrix = new int[rawSize][colSize];
		int[][] transposed = new int[colSize][rawSize];
		for (int i = 0; i < rawSize; i++) {
			for (int j = 0; j < colSize; j++) {
				System.out.println("Enter a num on index " + i + " " + j);
				matrix[i][j] = input.nextInt();
			}
		}

		for (int i = 0; i < rawSize; i++) {
			for (int j = 0; j < colSize; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < rawSize; i++) {
			for (int j = 0; j < colSize; j++) {
				transposed[j][i] = matrix[i][j];
			}
		}

		System.out.println("Transposed: \n");
		for (int i = 0; i < colSize; i++) {
			for (int j = 0; j < rawSize; j++) {
				System.out.print(transposed[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
