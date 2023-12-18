import  java.util.Scanner;
public class SquarePattern {

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         //defining the rows
        for(int i = 1; i <= N; i++){
            //defining the columns
            for(int j = 1; j <= N; j++){
                int min;
                min = Math.min(i, j);   //matrix[i,j]
                System.out.print( N-min+1  + " ");
            }
            System.out.println();
        }
    }
}
