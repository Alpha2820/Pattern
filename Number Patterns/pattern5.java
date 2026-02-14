/*
 Example (rows = 4):
    1
   12
  123
 1234
*/
import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int copy = rows;
        for(int i = 1 ; i<=rows ; i++)
        {
            for(int space = 1 ; space<copy ; space++)
            {
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print(j+"");
            }
            copy--;
            System.out.println();
        }
        sc.close();
    }
    
}
