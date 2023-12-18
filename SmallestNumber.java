import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        //using Math.min() find the smallest value among three numbers
        int a = Math.min(x,y);
        System.out.println(Math.min(a,z));
    }
}
