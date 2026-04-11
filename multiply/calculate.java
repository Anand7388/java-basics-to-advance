package multiply;

import java.util.Scanner;

public class calculate {
    // make a funktion to multiply 2 numbers and return the result.
    public static int calculate(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product of 2 is: " + calculate(a, b));
    }
}
