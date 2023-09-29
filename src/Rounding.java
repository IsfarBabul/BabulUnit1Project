public class Rounding {

    public static double priceRound(double num) {
        num *= 100;
        num = (int) num;
        num /= 100;
        return num;
    }

}
