import java.util.Scanner;

public class max1020 {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        System.out.println("Enter another number");
        int b=sc.nextInt();

        boolean aValid = (a >= 10 && a <= 20);
        boolean bValid = (b >= 10 && b <= 20);

        if(aValid && bValid){
            System.out.println(Math.max(a,b));
        } else if (aValid) {
            System.out.println(a);
        }else if(bValid){
            System.out.println(b);
        }else{
            System.out.println("0");
        }
        sc.close();
    }
}
