public class startOZ {
    public static void main(String[] args) {

    String str ="z";
    int n=str.length();
    String result ="";

    if((n>=2) && str.charAt(0)=='o' && str.charAt(1)=='z'){
        System.out.println(result +str.charAt(0)+str.charAt(1));
    }else if ((n>=1) && str.charAt(0)=='o'){
        System.out.println(result+str.charAt(0));
        }else if ((n>=2) && str.charAt(1)=='z'){
        System.out.println(result+str.charAt(1));
    }else{
        System.out.println(result);
    }
}
}
