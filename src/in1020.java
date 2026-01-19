import java.util.Scanner;

public class in1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Integer.");
        int a= sc.nextInt();
        System.out.println("Enter 2nd Integer.");
        int b= sc.nextInt();

        if((a>=10 && a<=20)||(b>=10 && b<=20)){
            System.out.println("True.");
        }else{
            System.out.println("False.");
        }
        sc.close();
    }
}
