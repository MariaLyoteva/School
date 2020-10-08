package Paint;
import java.util.Scanner;
public class Paint {

	public static void main(String[] args) {
		double roomLength, roomWidth, roomHeight, paintingArea;
		int largeBucketCounter = 0, smallBucketCounter = 0;
		Scanner reader = new Scanner(System.in);
	   	System.out.println("Please enter the length of the room.");
		roomLength = reader.nextDouble();
	   	System.out.println("Please enter the width of the room.");
		roomWidth = reader.nextDouble();
	   	System.out.println("Please enter the height of the room.");
		roomHeight = reader.nextDouble();
		paintingArea = 2 * roomLength * roomHeight + 2 * roomWidth * roomHeight + roomLength * roomWidth;
		for (int i = 0; i <= paintingArea; i += 140) {
			largeBucketCounter++;
		}
		largeBucketCounter--;
		paintingArea -= largeBucketCounter * 140;
		for (int i = 0; i < paintingArea; i += 30) {
			smallBucketCounter++;
		}
		//smallBucketCounter++;
		System.out.println("You will need " + largeBucketCounter + " large buckets and " + smallBucketCounter + " small buckets. This will cost you: " + (15 * largeBucketCounter + 4 * smallBucketCounter) + "$");
	}

}
