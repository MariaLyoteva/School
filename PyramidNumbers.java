package pyramidNumbers;

import java.util.Scanner;

public class PyramidNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		input.close();
		for (int i = 0; i < rows; i++) {
			for (int j = rows - i; j > 0; j--) {
				System.out.print(j + " ");
			}
			for (int j = 2; j <= rows - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

