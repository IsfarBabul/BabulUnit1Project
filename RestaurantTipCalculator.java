import java.util.Scanner;

public class RestaurantTipCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numPeople;
        int tipPercentage;
        State americanState;
        int totalPrice;

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        numPeople = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        tipPercentage = scan.nextInt();
        System.out.print("What U.S.state are you in (if your not in a U.S. state type anything else)? ");
        americanState = scan.nextLine();
        System.out.print("How many people are in your group: ");
        numPeople = scan.nextInt();




    }
}
