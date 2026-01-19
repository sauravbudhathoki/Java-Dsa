public class BackAround {
    public static void main(String[] args) {
        String str ="Mahadev";
        int n=str.length();
            String s1=str.substring(n-1);
            System.out.println(s1+str.substring(0,n)+s1);

        }
    }

/*
public class BackAround {
    public static void main(String[] args) {
        String str = "Mahadev";
        String lastChar = str.substring(str.length() - 1);
        System.out.println(lastChar + str + lastChar);
    }
}
*/
