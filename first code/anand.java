import java.util.*;
public class anand {
    public static void main(String[] args) {
        anandMethod();
    }
    public static void anandMethod() {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);
    }
    
    public static void printMyName(String name) {
        System.out.println("My name is: " + name);
    }
}