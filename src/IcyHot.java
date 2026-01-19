import java.sql.SQLOutput;
import java.util.Scanner;

public class IcyHot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature 1.");
        int temp1=sc.nextInt();
        System.out.println("Enter Temperature 2.");
        int temp2=sc.nextInt();

        if((temp1>100 && temp2<0)|| (temp1<0 && temp2>100)){
            System.out.println("True");;
        } else{
            System.out.println("False");;
        }
        sc.close();
    }
}
