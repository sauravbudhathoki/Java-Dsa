import java.util.Scanner;

public class intMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b=sc.nextInt();
        System.out.println("Enter 3rd number:");
        int c=sc.nextInt();

        String str = " is the Largest among the Three.";


        if((a>=b)&&(a>=c)){
            System.out.println(a+"(a)"+str);;
        }else if((b>=a)&&(b>=c)){
            System.out.println(b+"(b)"+str);;
        }else{
            System.out.println(c+"(c)"+str);;
        }
        sc.close();
    }
}

//int max = Math.max(a, Math.max(b, c));
//System.out.println(max + " is the Largest among the Three.");


//Using Ternary Operator

//int max = (a > b) ? a : b;
//max = (max > c) ? max : c;
//
//System.out.println(max + " is the Largest among the Three.");

//Using Loop

//int[] nums = {a, b, c};
//int max = nums[0];
//
//for (int i = 1; i < nums.length; i++) {
//        if (nums[i] > max) {
//            max = nums[i];
//        }
//     }
//
//  System.out.println(max + " is the Largest among the Three.");

