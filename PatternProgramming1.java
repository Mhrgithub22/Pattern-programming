package in.ineuron.main;

public class PatternProgramming1 {

	public static void main(String[] args) 
	{
		
		 int n =8;
		
		 for(int i=0; i<n;i++)
		 {
//				code to print I

			for (int j=0; j<n;j++)
			{
				if (i==0 || i==n-1 || j==(n-1)/2)
				System.out.print("I");
				
				else 
					System.out.print(" ");
			}
			System.out.print("\t");
			
//			code to print N
			
			for (int j=0; j<n;j++)
			{
				if (j==0 || j==n-1 ||  i==j )
				System.out.print("N");
				
				else 
					System.out.print(" ");
			}
			
		    System.out.print("\t");
		    
//		    code to print E
		    
		    for ( int j=0;j<n;j++)
		    {
		    	if (j==0 || i==0 || i==(n-1)/2 || i==n-1)
		    		System.out.print("E");
		    	else
		    		System.out.print(" ");
		    }
		    System.out.print("\t");
		    
//		   code to print U 
		    
		    for ( int j=0;j<n;j++)
		    {
		    	if (j==0 && i<n-1 || j== n-1 && i<n-1 || i==n-1 && j>0 && j<n-1)
		    		System.out.print("U");
		    	else
		    		System.out.print(" ");
		    }
		    System.out.print("\t");
		    
//		    code to print R
		    
		    for ( int j=0;j<n;j++)
		    {
		    	if (j==0 || i==0 && j< n-1 || j==n-1 && i>0 && i< (n-1)/2 || i== (n-1)/2 && j<n-1 ||
		    	    i==j && j> (n-1)/2)
		    		System.out.print("R");
		    	else
		    		System.out.print(" ");
		    }
		    System.out.print("\t");
		    
//		    code to write O 
		    
		    for (int j=0;j<n;j++)
		    {
		    	
		    	if(i==0 && j>0&& j<n-1 || j==0 && i>0 &&i<n-1 || i==n-1 && j>0 &&j<n-1 || j==n-1 && i>0 &&i<n-1)
		    		System.out.print("o");
		    	else
		    		System.out.print(" ");
		    }
		    System.out.print("\t");
		    
//		    code to write N
		 
		    for (int j=0; j<n;j++)
			{
				if (j==0 || j==n-1 ||  i==j )
				System.out.print("N");
				
				else 
					System.out.print(" ");
			}
		    
		    
			System.out.println();
			
		 }
	}
		 
}
     
	




