/*
 Example (rows = 4):
    A 
   A B 
  A B C 
 A B C D 
*/
import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = sc.nextInt();
        for(int i = 1 ; i<=rows ; i++)
        {
            char ch = 'A';
            for(int space = 1; space<=rows-i ; space++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i ; j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
