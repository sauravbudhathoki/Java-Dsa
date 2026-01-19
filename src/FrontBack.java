import java.sql.SQLOutput;

public class FrontBack {
    public static void main(String[] args) {
        String str="Chocolate";
        int n= str.length();

        if(n>=2){
            System.out.println(str.substring(n-1,n)+str.substring(1,n-1)+str.substring(0,1));
        }else{
            System.out.println(str);
        }

        /*String str="Chocolate";
        String s1;
        String s2;
        String s3;
        int n=str.length();

        if(n>=2){
            s1=str.substring(0,1);
            s2=str.substring(1,n-1);
            s3=str.substring(n-1,n);
            System.out.println(s3+s2+s1);
        }else{
            System.out.println(str);
        }

*/
    }
}
