package pattern;
import java.util.Scanner;
class  Pattern7 {
	public static void main(String args[]){
		System.out.println("--PATTERN PROGRAMMING--");
		System.out.println("How many line you wnat to print ?");
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		System.out.println("--PATTERN IS FOLLOWING--\n\n");
		int i;
        for(i=1;i<=n;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}	
		for(int k=i-1;k>=1;k--)
		{
          System.out.print(k);		
		}
		
          System.out.println("");
		} 			
	}
}

