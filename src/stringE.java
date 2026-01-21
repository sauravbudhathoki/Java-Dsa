import java.util.Scanner;

public class stringE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String str =sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e') {
                count++;
            }
            if(count>3) break;
        }
        System.out.println(count>=1 && count<=3 );
        sc.close();
    }

}
