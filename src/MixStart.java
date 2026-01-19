import java.util.Scanner;

public class MixStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = sc.nextLine();

        int n = str.length();

        if ((n >= 3) && str.substring(1, 3).equals("ix")) {
            System.out.println("True.");
        } else {
            System.out.println("False.");

        }
        sc.close();
    }
}
