package pattern;
import java.util.Scanner;
class  Pattern14 {
	public static void main(String args[]){
		System.out.println("--PATTERN PROGRAMMING--");
		System.out.println("How many line you wnat to print ?");
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=n;j++)
		{
			if(i%2==0)
			{
				if(j%2==0)
				{
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			else {
				if(j%2==0)
				{
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			 }
			}	
         System.out.println();		
		}
            			
	}
}

