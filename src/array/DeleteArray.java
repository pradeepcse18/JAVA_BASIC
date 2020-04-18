package array;
import java.util.Scanner;
public class DeleteArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int a[]=new int[50];
		System.out.println("enter the array no");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("enter the no which want delete");
		int del=sc.nextInt();
		int pos=1;
		
		
		for(int i=0;i<=n;i++){
			if(a[i]==del){
				pos=i;
			}
			}
			for(int i=pos;i<=n;i++){
				a[i]=a[i+1];
			}
			
		
		System.out.println("new array:");
		for(int i=0;i<n-1;i++){
		System.out.println(a[i]+" ");
		}
    }
}
		
	
