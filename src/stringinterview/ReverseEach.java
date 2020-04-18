package stringinterview;

import java.util.Scanner;
public class ReverseEach{
		public static void main(String []arg){
			{ 
			    Scanner sc=new Scanner(System.in);
			    System.out.println("Enetr the String :");
				String input=sc.nextLine();
				input=input+" ";
				int n=input.length();
				int i,j,k,l,limit=0;
				
				char ch[]=new char[n];
				for(i=0;i<=n-1;i++){
				      ch[i]=input.charAt(i);    
                    if(ch[i]==' ')
				       { 
					         for(j=i-1;j>=limit;j--){ 
						     System.out.print(ch[j]);
					         }
					     limit=i+1;
					     System.out.print(" ");	
				      }   			  
				}	
			}	
		}
	}
