public class Front3 {
    public static void main(String[] args) {

        String str="Krishna";
        String s;
        int n = str.length();

        if(n>=3) {
            s = str.substring(0, 3);
            System.out.println(s + s + s);
        }else{
            System.out.println(str+str+str);
        }
    }
}

/*public String front3(String str) {
    String front = str.length() >= 3 ? str.substring(0, 3) : str;
    return front + front + front;
}*/

