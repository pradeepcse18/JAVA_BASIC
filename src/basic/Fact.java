package basic;
import java.util.Scanner;

public class Fact{
	public static void main(String args[]){
		System.out.print("Enter the no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("factorial is:");
		/*int fact=1;
		for(int i=n;i>=1;i--){
			fact=fact*i;
		}
		System.out.print(fact);
		*/
		int x=fact(n);
		System.out.print(x);
	}
	public static int fact(int n){
		if(n<=1){
			return 1;
		}
		else {
			
		int fact;
		return fact=n*fact(n-1);
	 
	}
}
}
