import java.util.Scanner;

public class close10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number(a):");
        int a = sc.nextInt();
        System.out.println("Enter number(b):");
        int b = sc.nextInt();

        if((Math.abs(a-10)!=(Math.abs(b-10))) && (Math.abs(a-10)>(Math.abs(b-10)))){
            System.out.println(Math.abs(b)+"1");
        }else if((Math.abs(a-10)!=(Math.abs(b-10))) && (Math.abs(b-10)>(Math.abs(a-10)))){
            System.out.println(Math.abs(a)+"2");
        }else {
            System.out.println("0");
        }
        sc.close();
    }
}

