package array;
import java.util.Scanner;
public class Merge{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array1 size");
		int n1=sc.nextInt();
		int a1[]=new int[n1];
		System.out.println("enter the array no");
		for(int i=0;i<n1;i++){
			a1[i]=sc.nextInt();
		}
		
		System.out.println("enter the array 2 size");
		int n2=sc.nextInt();
		int a2[]=new int[n2];
		System.out.println("enter the array no");
		for(int i=0;i<n2;i++){
			a2[i]=sc.nextInt();
		}
		int n=n1+n2;
		int a[] =new int[n];
		
		
		for(int i=0;i<n1;i++){
			a[i]=a1[i];
		}
		int j,k;
		for(j=0,k=n1;j<n2&&k<n;j++,k++){
			a[k]=a2[j];
		}
		
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		
		
		}
	}
