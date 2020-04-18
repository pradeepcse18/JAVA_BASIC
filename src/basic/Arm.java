package basic;
import java.util.Scanner;
import java.lang.Math;
public class Arm{
	public static void main(String args[]){
		System.out.println("enter the No:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double x,num=0,rem;
		x=n;
		
		while(n!=0){
			rem=n%10;
			num=num+Math.pow(rem,3);
			n=n/10;
		}
		if(num==x){
			System.out.println("no is Armstrong");
		}
		else{
			System.out.println("no is  not armstrong");
		}
		
	}
}