import java.util.Scanner;

public class StartHi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String.");
        String str = sc.nextLine();

        int n=str.length();

        if((n>=2) && str.substring(0,2).equalsIgnoreCase("Hi")){
            System.out.println("True.");
        }else{
            System.out.println("False.");
        }
        sc.close();
    }
}
