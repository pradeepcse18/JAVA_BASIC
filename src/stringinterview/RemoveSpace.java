package stringinterview;

import java.util.Scanner;
public class RemoveSpace{
		public static void main(String []arg){
			{ 
			    Scanner sc=new Scanner(System.in);
			    System.out.println("Enetr the String :");
				String input=sc.nextLine();
				int n=input.length();
				int i,j,k,l,limit=0;
				
				char ch[]=new char[n+1];
				for(i=0;i<=n-1;i++){
				      ch[i]=input.charAt(i);
				}
				for(i=0;i<=n-1;i++){    
                    if((ch[i]==' ')&&(ch[i+1]==' '))
				       { 
				   
				      }  
                    else if((ch[i+1]==' ')&&((ch[i+1])!=' '))	{
						System.out.print(ch[i]);
					}	
                   else{
					System.out.print(ch[i]);   
				   }					
				}	
			}	
		}
	}
