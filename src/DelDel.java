import java.util.Scanner;

public class DelDel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String.");
        String str = sc.nextLine();
        int n=str.length();

        if((n>=4) && str.substring(1,4).equalsIgnoreCase("del")){
            System.out.println(str.substring(0,1)+str.substring(4,n));
        }else{
            System.out.println(str);
        }
sc.close();

    }
}
