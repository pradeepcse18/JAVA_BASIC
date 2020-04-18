package pattern;
import java.util.Scanner;
class  Pattern4 {
	public static void main(String args[]){
		System.out.println("--PATTERN PROGRAMMING--");
		System.out.println("How many line you wnat to print ?");
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		System.out.println("--PATTERN IS FOLLOWING--\n\n");
		int i;
        for(i=0;i<n;i++)
		{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(j);
		}	
         System.out.println();		
		}
            			
	}
}

