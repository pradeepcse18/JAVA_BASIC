package basic;
import java.util.Scanner;

public class Pasc
{
    public static void main(String args[])
	{
	    int n, i, k,number, j;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number of Rows : ");
		n = scan.nextInt();
		
		for(i=0;i<n;i++)
		{
			for(k=n; k>i; k--)
			{
				System.out.print(" ");
			}
             number = 1;
			for(j=0;j<=i;j++)
			{
				 System.out.print(number+ " ");
                 number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
		
	}
}