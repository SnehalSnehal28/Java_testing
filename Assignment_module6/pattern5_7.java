package Assignment_module6;

public class pattern5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Upper half
        for(int i = 1; i <= 3; i++) {
        	for(int j = i; j < 3; j++) {
        		System.out.print(" ");
        	}
        		for(int j=1;j<=(2 * i -1);j++) {
        			System.out.print("*");
        		}
        		System.out.println();
        	}
        
        //Bottom half
       for (int i=3-1;i>=1;i--) {
    	   for(int j=3;j>i;j--) {
    		   System.out.print(" ");
    	   }
    	   for (int j=1; j<=(2 * i -1);j++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
    }
}
//  *
// ***
//*****

// ***
//  *












