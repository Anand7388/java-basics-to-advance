class Main {
    public static void main(String[] args) {
        int n = 5; // Example input 

       int number = 1; // Starting number

       // outer loop 
       for (int i = 1; i <= n; i++) {

        // inner loop
        for (int j = 1; j <= i; j++) {
            System.out.print(number + "");
            number ++; // increment the number for the next print 
        }
        System.out.println();
       }
    }
}
