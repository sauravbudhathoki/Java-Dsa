import java.util.Scanner;

public class Front22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String.");
        String str =sc.nextLine();

        int n=str.length();

        if(n>=2){
            String s=str.substring(0,2);
            System.out.println(s+str+s);
        }else{
            System.out.println(str+str+str);
        }
        sc.close();
    }
}
