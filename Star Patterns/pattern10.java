import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int copy = rows;
        for(int i = 1 ; i<=rows ; i++)
        {
            for(int space = 1 ; space<=copy-i ; space++)
            {
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i = 6 ; i>=1 ; i--)
        {
            for(int space = 1 ; space<=copy-i ; space++)
            {
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
