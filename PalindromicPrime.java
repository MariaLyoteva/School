package packageArrays;

public class PalindromicPrime {

	public static void main(String[] args) {
		System.out.print(2 + "\t");
		int count =1;
		int number=3;
		while(count<120) {
			int copyNumber = number;
		int	reversedNum = 0;
		while(copyNumber !=0) {
			int reminder = copyNumber %10;
			reversedNum = reversedNum*10 + reminder;
			copyNumber/=10;
		}
		boolean isPal = number == reversedNum;
		if (!isPal) {
			number++;
			continue;
		}
		int maxDivider = (int)Math.ceil(Math.sqrt(number));
		boolean isPrime = true;
		for(int i =2; i<=maxDivider; i++) {
			if(number%i ==0) {
				isPrime=false;
				break;
			}
		}
		if(!isPrime) {
			number++;
			continue;
		}
		System.out.print(number +"\t");
		count++;
		number++;
		if(count%10 ==0) {
			System.out.println();
		}
		}

	}

}
