import java.util.Scanner;
public class FinalAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill_amount = sc.nextDouble();
//      discount applied when the amount lies between the given condition.
        if (bill_amount < 500) {
            System.out.println("Sorry,no discount applied for this amount : " + bill_amount);
        }
        else if (bill_amount >= 500 && bill_amount <= 1000) {
                double Discount_1 = (bill_amount * 10) / 100;
                System.out.println("WOW! you got 10% discount");
                System.out.println("Yours purchased amount is : " + (Discount_1 + bill_amount));
        }
        else {
            double Discount_2 = (bill_amount * 20) / 100;
            System.out.println("Congrats! you got 20% discount");
            System.out.println("Your bill amount is : " + (Discount_2 + bill_amount));
        }
    }
}

