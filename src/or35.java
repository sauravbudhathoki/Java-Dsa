import java.util.Scanner;

public class or35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number(n).");
        int n = sc.nextInt();

        if((n%3==0)||(n%5==0)){
            System.out.println("True.");
        }else{
            System.out.println("False.");
        }
        sc.close();
    }
}
