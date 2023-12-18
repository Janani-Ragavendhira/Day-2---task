import  java.util.Scanner;

public class CheckNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        // check the given number is +ve or -ve
        if(num > 0){
            System.out.println(num + " is a Positive number. ");
        }
        else{
            System.out.println(num + " is a Negative number. ");
        }
    }
}
