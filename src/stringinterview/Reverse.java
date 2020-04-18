package stringinterview;

import java.util.Scanner;
public class Reverse{
	public static void main(String args[]){
		System.out.println("enter the String:");
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		StringBuilder s=new StringBuilder();
		 s.append(n);
		
		System.out.println(s.reverse());
		
		char ch[]=n.toCharArray();
		 for(int i=ch.length-1;i>=0;i--){
			 System.out.print(ch[i]);
		 }
		
		}
	}
