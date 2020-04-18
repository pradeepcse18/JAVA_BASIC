package basic;

import java.util.Scanner;
public class PrimeList{
	public static void main(String args[]){
		System.out.println("Enter the start and end no:");
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		System.out.println("Prime no are:");
		for(int i=start;i<=end;i++){
			int count=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					count++;
					break;
				}
			}
			if(count==0){
				System.out.print(i+" ");
				
			}
		}
	}
}