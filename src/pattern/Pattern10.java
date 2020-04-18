package pattern;
import java.util.Scanner;
class  Pattern10 {
	public static void main(String args[]){
		System.out.println("--PATTERN PROGRAMMING--");
		System.out.println("How many line you wnat to print ?");
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
		{
		for(int j=i;j>=1;j--)
		{
			System.out.print(j);
		}	
         System.out.println();		
		}
            			
	}
}

