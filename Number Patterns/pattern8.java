import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = sc.nextInt();
        int copy = rows;
        for(int i=rows ; i>=1; i--)
        {
            for(int space = 1 ; space<=copy-i ; space++)
            {
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print(j+"");
            }
            System.out.println();
        }
        for(int k = 2; k<=rows;  k++)
        {
            for(int space = 1 ; space<=rows-k ; space++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=k ; j++)
            {
                System.out.print(j+"");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
