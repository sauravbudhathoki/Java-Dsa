public class monkeyTrouble {
    public static void main(String[] args) {
        boolean aSmile = true;
        boolean bSmile = true;

        if((aSmile && bSmile)||(!aSmile && !bSmile)){
            System.out.println("True.");
        }else{
            System.out.println("False.");
        }
    }
}
