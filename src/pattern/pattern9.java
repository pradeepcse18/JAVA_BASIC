package pattern;
import java.util.Scanner;
class  Pattern9 {
	public static void main(String args[]){
		System.out.println("--PATTERN PROGRAMMING--");
		System.out.println("How many line you wnat to print ?");
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		System.out.println("--PATTERN IS FOLLOWING--\n\n");
		
        for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=i-1;j++)
		{
			System.out.print(" ");
		}
         for(int k=i;k<=n;k++)
		 {
			 System.out.print(k);
		 }			 
          System.out.println("");
		}
     for(int i=n-1;i>=1;i--)
	 {
		for(int j=i-1;j>=1;j--)
		{
			System.out.print(" ");
		}
		for(int k=i;k<=n;k++)
		{
			System.out.print(k);
		}
		System.out.println("");
	}		
	}
}

