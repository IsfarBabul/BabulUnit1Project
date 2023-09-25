import java.util.Scanner;
import java.util.*;

public class RestaurantTipCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numPeople;
        int tipPercentage;
        int couponPercentage;
        String americanState;
        double totalPrice = 0;
        double itemPrice = 0;
        boolean end = false;
        String[] americanStatesList = {"alabama", "alaska", "arizona", "arkansas", "california",
                "colorado", "connecticut", "delaware", "florida", "georgia",
                "hawaii", "idaho", "illinois", "indiana", "iowa",
                "kansas", "kentucky", "louisiana", "maine", "maryland",
                "massachusetts", "michigan", "minnesota", "mississippi", "missouri",
                "montana", "nebraska", "nevada", "new hampshire", "new jersey",
                "new mexico", "new york", "north carolina", "north dakota", "ohio",
                "oklahoma", "oregon", "pennsylvania", "rhode island", "south carolina",
                "south dakota", "tennessee", "texas", "utah", "vermont",
                "virginia", "washington", "west virginia", "wisconsin", "wyoming",
                "american somoa", "guam", "northern mariana islands", "puerto rico", "united states virgin islands"};

        System.out.println("Welcome to the tip calculator!");
        //number of people
        System.out.print("How many people are in your group: ");
        numPeople = scan.nextInt();
        scan.nextLine();
        /* which U.S. state or territory your dining in
        (used to calculate sales tax and is applied after coupons and before tips) */
        System.out.print("What U.S. state or territory are you in? ");
        americanState = scan.nextLine();
        americanState = americanState.toLowerCase();
        //enter tip percentage (this is applied after coupons and sales tax)
        System.out.print("What's the tip percentage? (0-100): ");
        tipPercentage = scan.nextInt();
        while (tipPercentage < 0 || tipPercentage > 100) {
            System.out.print("That's not a valid tip percentage. Try again: ");
            tipPercentage = scan.nextInt();
        }
        //enter coupon percentage (this is applied before any sales tax or tips)
        System.out.print("What's the coupon percentage? (0-50): ");
        couponPercentage = scan.nextInt();
        while (couponPercentage < 0 || couponPercentage > 50) {
            System.out.print("That's not a valid coupon percentage. Try again: ");
            couponPercentage = scan.nextInt();
        }
        //asking for items and costs
        while (!end) {
            System.out.print("Enter a cost in dollars and cents, e.g. 7.49 (type any negative number to end): ");
            itemPrice = scan.nextDouble();
            if (itemPrice >= 0) {
                totalPrice += itemPrice;
            } else {
                end = true;
            }
        }

        System.out.println("-------------------------------");
        System.out.println("Total bill before coupons, sales tax, and tip: $" + totalPrice);
        System.out.println("Coupon Percentage: " + couponPercentage + "%");
        System.out.println("Total bill before coupons, sales tax, and tip: $" + totalPrice);
        System.out.println("Coupon Percentage: " + couponPercentage + "%");


    }
}
