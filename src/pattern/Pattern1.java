package pattern;
import java.util.Scanner;
import java.lang.Math;
class  Pattern1 {
	public static void main(String args[]){
		System.out.println("--PATTERN PROGRAMMING--");
		System.out.println("How many line you wnat to print ?");
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int r,c;
		int l=(int)Math.ceil(n/2);
		if(n%2==0)
		{
		r=l;
		c=l;
		for(int i=1;i<=r;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}	
         System.out.println();		
		}
		for(int i=c;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		}
		else{
			r=l+1;
			c=l;
			
			for(int i=1;i<=r;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}	
         System.out.println();		
		}
		for(int i=c;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
        
		}      			
	}
}

