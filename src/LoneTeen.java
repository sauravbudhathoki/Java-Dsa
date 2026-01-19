import java.util.Scanner;

public class LoneTeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a:");
        int a = sc.nextInt();
        System.out.println("Enter number b:");
        int b = sc.nextInt();

        if( ((a>=13 && a<=19) && (b<13 || b>19)) ||
                ((a<13 || a>19) && (b>=13 && b<=19)) ){
            System.out.println("True.");;
        }else {
        System.out.println("False.");;
    }
        sc.close();
    }
}
