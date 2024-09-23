public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {  // Adjusted the loop condition to j <= i
                System.out.print("*");      // Changed println to print
            }
            System.out.println();           // Moved the newline character print here
        }
    }
}
