import java.util.Scanner;

public class stringTimes {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String.");
        String str=sc.nextLine();

        System.out.println("Enter n.");
        int n=sc.nextInt();

        if(n>=0){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<n;i++)
                sb.append(str);
            System.out.println(sb.toString());
        }else{
        System.out.println(str);;
    }
    sc.close();
    }
}
