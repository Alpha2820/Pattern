/*
 Example (rows = 4):
     1
    1 2
   1 2 3
  1 2 3 4
*/
import java.util.*;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int sp = 1; sp <= rows - i; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }

}
/*
 * 1
 * 1 2
 * 1 2 3
 */
