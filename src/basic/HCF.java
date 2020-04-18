package basic;
import java.util.Scanner;
public class HCF{
	public static void main(String args[]){
		System.out.println("enter the two no:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a=x,t;
		int b=y;
		while(b!=0){
			t=b;
			b=a%b;
			a=t;
		}
		int hcf=a;
		int lcm=(x*y)/hcf;
		System.out.println("HCF="+hcf);
		System.out.println("LCM="+lcm);
	}
}