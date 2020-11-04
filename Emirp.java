package packageArrays;

public class Emirp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cter = 0;
		int number = 3;
		while (cter < 120) {
			
			if (!isPrime(number) || isPal(number)|| !isPrime(reverseNum(number)) ) {
				number++;
				continue;
			}
			
			System.out.print(number + "\t");
			cter++;
			number++;
			if (cter % 10 == 0) {
				System.out.println();
			}

		}
	}

	public static boolean isPrime(int aNumber) {
		int maxDivider = (int) Math.ceil(Math.sqrt(aNumber));
		boolean isPrime = true;
		for (int i = 2; i <= maxDivider; i++) {
			if (aNumber % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static boolean isPal(int aNumber) {

	   return aNumber == reverseNum(aNumber);
	}
	
	public static int reverseNum(int aNum) {
		int copyNumber = aNum;
		int reversedNum = 0;
		while (copyNumber != 0) {
			int reminder = copyNumber % 10;
			reversedNum = reversedNum * 10 + reminder;
			copyNumber /= 10;
		}
		return reversedNum;
	}
}
