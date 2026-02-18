import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int rows = sc.nextInt();
        int copy = rows;
        for(int i = rows ; i>=1 ; i--)
        {
            char ch = 'A';
            for(int space = 1 ; space<=copy-i ; space++)
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
        for(int i = 2 ; i<=rows;  i++)
        {
            char ch = 'A';
            for(int space = 1 ; space<=copy-i ; space++)
            {
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        sc.close();

    }

}
