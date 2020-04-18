package pattern;
import java.util.Scanner;
class  Pattern3 {
	public static void main(String args[]){
		System.out.println("--PATTERN PROGRAMMING--");
		System.out.println("How many line you wnat to print ?");
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int i;
        for(i=1;i<=n;i++)
		{
		for(int j=n;j>=i;j--)
		{
			System.out.print(j);
		}	
         System.out.println();		
		}
            			
	}
}

