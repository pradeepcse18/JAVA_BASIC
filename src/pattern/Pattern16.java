package pattern;
import java.util.Scanner;
class  Pattern16 {
	public static void main(String args[]){
		System.out.println("--PATTERN PROGRAMMING--");
		System.out.println("How many line you wnat to print ?");
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		
        for(int i=0;i<=n-1;i++)
		{
		for(int j=0;j<=n-1;j++)
		{   if(i==j)
			System.out.print(i);
		else
			System.out.print("0");
			
		}	
         System.out.println();		
		}
            			
	}
}

