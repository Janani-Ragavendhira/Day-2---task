import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int num = sc.nextInt();
        // loop starts from the user input number
        for(int i = num; i <= 50; i++){
            System.out.println("The numbers are : " +i);
        }
    }
}
