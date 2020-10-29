package packageArrays;

public class Cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] deck = new int[52];
		for (int i = 0; i < 52; i++) {
			deck[i] = i;
		}
		for (int i = 0; i < 52; i++) {
			int rIndex = (int) (Math.random() * 10);
			int swap = deck[rIndex];
			deck[rIndex] = deck[i];
			deck[i] = swap;
		}
		int[] drCards = new int[4];
		for (int i = 0; i < 4; i++) {
			int rIndex = (int) (Math.random() * (52 - i));
			drCards[i] = deck[rIndex];
			for (int j = rIndex; j < deck.length - i - 1; j++) {
				deck[j] = deck[j + 1];
			}
			deck[deck.length - i - 1] = -1;
		}
		
		for(int i =0; i<4; i++) {
			int cI = drCards[i]/13;
			int valueInd = drCards[i]%13;
			String cardCol="";
			String cardVal ="";
			switch(cI) {
			case 0: cardCol = "spades"; break;
			case 1: cardCol = "hearts"; break;
			case 2: cardCol = "diamonds"; break;
			case 3: cardCol = "clubs"; break;
			}
			switch(valueInd) {
			case 0: cardVal = "2"; break;
			case 1: cardVal = "3"; break;
			case 2: cardVal = "4"; break;
			case 3: cardVal = "5"; break;
			case 4: cardVal = "6"; break;
			case 5: cardVal = "7"; break;
			case 6: cardVal = "8"; break;
			case 7: cardVal = "9"; break;
			case 8: cardVal = "10"; break;
			case 9: cardVal = "J"; break;
			case 10: cardVal = "Q"; break;
			case 11: cardVal = "K"; break;
			case 12: cardVal = "A"; break;
			}
			System.out.print(cardVal + " " + cardCol +", ");
		}
	}
}
