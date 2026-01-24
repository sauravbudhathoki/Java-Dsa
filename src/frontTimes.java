import java.util.Scanner;

public class frontTimes {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String.");
        String str=sc.nextLine();
        System.out.println("Enter n.");
        int n=sc.nextInt();

        StringBuilder sb = new StringBuilder();

        if(str.length()>=3){
            for(int i=0;i<n;i++) {
                sb.append(str.substring(0, 3));

            }
            System.out.println(sb.toString());
        }else{
            for(int i =0;i<n;i++)
          sb.append(str);
        }
        System.out.println(sb.toString());

        sc.close();
    }
}
