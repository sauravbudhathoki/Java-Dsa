public class MissingChar {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str="kitten";
        int n=3;

        for(int i=0;i<str.length();i++){
            if(i==n){
                continue;
            }else{
                sb.append(str.charAt(i));
            }

        }
        System.out.println(sb.toString()); ;

    }
}
