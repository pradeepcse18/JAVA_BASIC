package pattern;
import java.util.Scanner;
class  Pattern6 {
	public static void main(String args[]){
		System.out.println("--PATTERN PROGRAMMING--");
		System.out.println("How many line you wnat to print ?");
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		System.out.println("--PATTERN IS FOLLOWING--\n\n");
		int i;
        for(i=n;i>=1;i--)
		{
		for(int j=n;j>=i;j--)
		{
			System.out.print(j);
		}	
         System.out.println();		
		}
            			
	}
}

