import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Original number : ");
        int num = sc.nextInt();
        int reversed =0;
        // loop started till the num is 0
        while(num != 0){
            int remain = num % 10;
            reversed = reversed * 10 + remain;
            num = num / 10;
        }
        System.out.println("Reverse Number is : " +reversed);
    }
}
