package pattern;
import java.util.Scanner;
class  Pattern17 {
	public static void main(String args[]){
		System.out.println("--PATTERN PROGRAMMING--");
		System.out.println("How many line you wnat to print ?");
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int x=0;
        for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=i;j++)
		{   
			System.out.print(++x);
			
		}	
         System.out.println();		
		}
            			
	}
}

