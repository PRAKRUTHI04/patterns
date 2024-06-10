public class pattern4 {
    public static void main(String[] args) {
        // Print the upper part of the diamond
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the lower part of the diamond
        for (int i = 4-1; i >= 1; i--) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
