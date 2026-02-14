/*
 Example (rows = 4):
 ****
 ***
 **
 *
*/
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int copy = rows;
        for(int i = 1; i<=rows ; i++)
        {
            for(int j = 1 ; j<=copy ; j++)
            {
                System.out.print("*");
            }
            copy--;
            System.out.println();
        }
        sc.close();
    }
    
}
