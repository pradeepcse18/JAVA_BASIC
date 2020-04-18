package pattern;
import java.util.Scanner;
class  Pattern8 {
	public static void main(String args[]){
		System.out.println("--PATTERN PROGRAMMING--");
		System.out.println("How many line you wnat to print ?");
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		System.out.println("--PATTERN IS FOLLOWING--\n\n");
		
        for(int i=n;i>=1;i--)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}	
          System.out.println("");
		}
          for(int i=1;i<=n-1;i++)
		  {
			  for(int j=1;j<=i+1;j++)
			  { 
		         System.out.print(j);
		      }	
          System.out.println("");
		  }          			  
			
	}
}

