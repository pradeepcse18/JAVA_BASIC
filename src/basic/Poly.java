package basic;
import java.util.Scanner;
public class Poly{
	public static void main(String args[]){
		System.out.println("enter the No:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x,num=0,rem;
		x=n;
		
		while(n!=0){
			rem=n%10;
			num=num*10+rem;
			n=n/10;
		}
		if(num==x){
			System.out.println("no is polydrome");
		}
		else{
			System.out.println("no is  not polydrome");
		}
		
	}
}