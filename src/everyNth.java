import java.util.Scanner;

public class everyNth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String.");
        String str = sc.nextLine();

        System.out.println("Enter a number.");
        int n = sc.nextInt();

        int len = str.length();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i+=n) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());

        sc.close();
    }
}