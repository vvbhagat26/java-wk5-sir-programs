package homework_week_8;

import java.util.Scanner;

public class Prog15LeftTriangle {
    /**
     * Display left angle triangle of * using nested for loops
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     */
    public static void leftTriangle(int x) {
        int i, j;
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int a = scanner.nextInt();
        leftTriangle(a);
        // closing the scanner object
        scanner.close();
    }
}



