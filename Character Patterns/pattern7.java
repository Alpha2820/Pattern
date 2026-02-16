import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = sc.nextInt();
        for(int i = rows ; i>=1 ; i--)
        {
            char ch = 'A';
            for(int j = 1; j<=i ; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        for(int i = 2; i<=rows ; i++)
        {
            char ch = 'A';
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
