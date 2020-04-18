package array;
import java.util.Scanner;
public class Largest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array no");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=1;i<n;i++){
			if(max<a[i]){
				max=a[i];
			}
		}
		System.out.println( "larget no="+max);
		
		}
	}
