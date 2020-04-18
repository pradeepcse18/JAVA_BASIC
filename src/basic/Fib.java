package basic;
import java.util.Scanner;
public class Fib{
	public static void main(String args[]){
		System.out.println("enter the two no to print FIB series:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=-1,t;
		int b=1;
		for(int i=0;i<n;i++){
			t=b;
			b=a+b;
			a=t;
			System.out.print(b+" ");
		}
	}
}