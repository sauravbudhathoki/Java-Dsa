import java.util.Scanner;

public class HasTeen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the third number");
        int c=sc.nextInt();

        if((a>=13 && a<=19)||(b>=13 && b<=19)||(c>=13 && c<=19)){
            System.out.println("True.");;
        }else {
            System.out.println("False.");
        }
    }
}
