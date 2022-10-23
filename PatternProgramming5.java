package in.ineuron.main;

public class PatternProgramming5 {

	public static void main(String[] args) {

		int k=13;
		 for (int i=0;i<k;i++)
		 {
			 for (int j=0;j<k;j++)
			 {
				if (i==0 || i==k-1 || j==0 || i+j<=(k-1)/2 || i-j>=(k-1)/2) 
					System.out.print("*");
				else
					System.out.print(" ");
			 }
			 System.out.println( );
	  }

	}
}
