package packageArrays;
public class RandomNumbersArr {
	public static void main(String[] args) {
		int[] randomArray = new int[20];
		for(int i = 0; i<20; i++) {
			randomArray[i]=(int)(Math.random()*50 +1);
		}
		for(int i = 0; i<20; i++) {
			System.out.println(randomArray[i]);
		}
	}
}
