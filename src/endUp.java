import java.util.Scanner;

public class endUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the desired String.");
        String str = sc.nextLine();

        int n =str.length();

        if(n>3) {
            System.out.println(str.substring(0,n-3)+str.substring(n-3,n).toUpperCase());
        }else{
            System.out.println(str.toUpperCase());
        }
        sc.close();
    }
}
