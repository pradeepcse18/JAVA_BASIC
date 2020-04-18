package pattern;
import java.util.Scanner;
 
public class Pattern15
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("How many n you want in this pattern?");
         
        int n= sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        for (int i = 1; i <= n; i++) 
        {
            int m= i;
             
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(m+" ");
                 
                m= m+n-j;
            }
             
            System.out.println();
        }
         
        sc.close();
    }
}