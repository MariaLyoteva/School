package tuitionUni;

public class TuitionUni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int currentFee = 10_000;
     int years = 10;
     double lihva = 0.06;
     double futFee = currentFee;
     double entireFee = 0;
     int i = 0;
      for(i =0; i<=years; i++) {
    	 futFee += currentFee*lihva;
      //   System.out.println("UniFee: " + futFee); 
     }
      for(int j=0; j<4; j++) {
    	  entireFee += futFee;
    	  futFee += futFee*lihva;
      }
      System.out.println(entireFee);
	}

}
