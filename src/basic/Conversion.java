package basic;
import java.util.Scanner;
public class Conversion{
	public static void main(String args[]){
		System.out.println("enter the no:");
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		
		//System.out.println("other  to decimal="+
		int x=(Integer.parseInt(n,16));
		System.out.println(Integer.toOctalString(x));
		
		}
	}
