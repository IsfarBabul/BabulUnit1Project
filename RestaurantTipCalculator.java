import java.util.Scanner;
import java.util.*;

public class RestaurantTipCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numPeople;
        int tipPercentage;
        int couponPercentage;
        State americanState;
        double totalPrice = 0;
        double itemPrice = 0;
        boolean end = false;

        System.out.println("Welcome to the tip calculator!");
        //number of people
        System.out.print("How many people are in your group: ");
        numPeople = scan.nextInt();
        /* which U.S. state or territory your dining in
        (used to calculate sales tax and is applied after coupons and before tips) */
        System.out.print("What U.S. state or territory are you in? ");
        americanState = scan.nextLine();
        americanState = americanState.toLowerCase();
        //enter tip percentage (this is applied after coupons and sales tax)
        System.out.print("What's the tip percentage? (0-100): ");
        tipPercentage = scan.nextInt();
        while (tipPercentage < 0 && tipPercentage > 100) {
            System.out.print("That's not a valid tip percentage. Try again: ");
            tipPercentage = scan.nextInt();
        }
        //enter coupon percentage (this is applied before any sales tax or tips)
        System.out.print("What's the coupon percentage? (0-50): ");
        numPeople = scan.nextInt();
        while (tipPercentage < 0 && tipPercentage > 50) {
            System.out.print("That's not a valid coupon percentage. Try again: ");
            couponPercentage = scan.nextInt();
        }
        //asking for items and costs
        while (end = false) {
            System.out.print("Enter a cost in dollars and cents, e.g. 7.49 (type any negative number to end): ");
            itemPrice = scan.nextDouble();
            if (itemPrice >= 0) {
                totalPrice += itemPrice
            } else {
                end = true
            }
        }





    }
}
