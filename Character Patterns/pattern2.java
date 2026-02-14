/*
 Example (rows = 4):
 ABCD
 ABC
 AB
 A
*/
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int copy = rows;
        for(int i = 1 ; i<=rows ; i++)
        {
            char ch = 'A';
            for(int j = 1 ; j<=copy ; j++)
            {
                System.out.print(ch);
                ch++;
            }
            copy--;
            System.out.println();
        }
        sc.close();
    }
    
}
