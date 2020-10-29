package packageArrays;

import java.util.Scanner;
import java.util.Random;
public class Craps{
	static int Method() {
		Random rand = new Random();
		int die1 = rand.nextInt(6);
		die1++;
		int die2 = rand.nextInt(6);
		die2++;
		System.out.println("Die1: " + die1 + "\n" + "Die2: " + die2 + "\n" +"Sum: " + (die1 + die2));
		System.out.println("");
		return (die1+die2);
	}
	public static void main(String[] args) {
		int point;
		char b = 0;
		int a = Method();
		if (a == 2 || a == 3 || a == 12) {
			b = 1;
		}else if (a == 7 || a == 11) {
			b = 2;
		}else {
			point = a;
			while (b == 0) {
				a = Method();
				if (a == 7) {
					b = 1;
				}
				if (a == point) {
					b = 2;
				}
			}
		}
		if (b == 1) {
			System.out.println("You lose!");
		}else {
			System.out.println("You win!");
		}
	}
}
