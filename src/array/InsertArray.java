package array;
import java.util.Scanner;
public class InsertArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int a[]=new int[50];
		System.out.println("enter the array no");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("enter the no which want insert");
		int ins=sc.nextInt();
		System.out.println("enter the pos at which want insert");
		int pos=sc.nextInt();
		
		
		for(int i=n;i>=pos;i--){
			a[i]=a[i-1];
			}
			a[pos-1]=ins;
		
		System.out.println("new array:");
		for(int i=0;i<=n;i++){
		System.out.println(a[i]+" ");
		}
    }
}
		
	
