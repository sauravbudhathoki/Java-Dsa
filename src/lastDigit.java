import java.util.Scanner;

public class lastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter another number");
        int b = sc.nextInt();

        int aValid = (a % 10);
        int bValid = (b % 10);

        if(aValid == bValid){
            System.out.println("The last digit of both Integer number is SAME.");
        }else{
            System.out.println("The last digit of both Integer number is not SAME.");
        }
        sc.close();
    }
}
