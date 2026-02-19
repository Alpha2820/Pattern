import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int rows = sc.nextInt();
        for(int i = 1 ; i<=rows ; i++)
        {
            char ch = 'A';
            for(int j = 1; j<=i ; j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        int copy = rows-1;
        for(int i = copy ; i>=1 ; i--)
        {
            char ch = 'A';
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
