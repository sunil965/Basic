public class PrintDimond {
    static void printDiamond(int n)
    {
        int space = n - 1;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < space; j++)
                System.out.print(" ");

            // Print i+1 stars
            for (int j = 0; j <= i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space--;
        }

        // reverse order
        space = 0 ;

        for (int i = n; i > 0; i--)
        {
            for (int j = 0; j < space; j++)
                System.out.print(" ");

            // Print i+1 stars
            for (int j = 0; j < i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space++;
        }

        // Approach 2.

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= 2 * n - 1; j++) {
                if (j >= n - (i - 1) && j <= n + (i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= 2 * n - 1; j++) {
                if (j >(i) && j < (2*n) - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        printDiamond(5);

    }
}
