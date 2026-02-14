/*
 Example (rows = 4):
 1234
 123
 12
 1
*/
import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        int copy = rows;
        for(int i = 1 ; i<=rows ; i++)
        {
            for(int j = 1 ; j<=copy ; j++)
            {
                System.out.print(j);
            }
            copy--;
            System.out.println();
        }
        sc.close();
    }
    
}
