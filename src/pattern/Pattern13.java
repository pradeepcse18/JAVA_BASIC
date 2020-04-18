package pattern;
import java.util.Scanner;
class  Pattern13 {
	public static void main(String args[]){
		System.out.println("--PATTERN PROGRAMMING--");
		System.out.println("How many line you wnat to print ?");
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int i;
        for(i=1;i<=n;i++)
		{
		for(int j=1;j<=n-i-1;j++)
		{
			System.out.print(1);
		}
        for(int k=1;k<=i;k++)
		{
			System.out.print(i);
		}			
         System.out.println();		
		}
            			
	}
}

