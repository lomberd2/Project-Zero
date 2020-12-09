package Statistik;

public class Spannweite {

    /**
     * Find out the span from two Variables with int
     * @param max Highest number in the array or whatever
     * @param min Lowest number in the array or whatever
     * @return Span from min and max.
     */
    public static int spannweite(int max, int min){
        int spannweite = max - min;
        return spannweite;
    }

    /**
     *
     *  Find out the span from two Variables with double
     */
    public static double spannweite(double zahl1, double zahl2){
        double spannweite = zahl1 - zahl2;
        return spannweite;
    }

    /**
     *
     * Find out the span from two Variables with long
     */
    public static long spannweite(long zahl1, long zahl2){
        long spannweite = zahl1 - zahl2;
        return spannweite;
    }

    /**
     *
     * Find out the span from two variables with float
     */
    public static float spannweite(float zahl1, float zahl2){
        float spannweite = zahl1 - zahl2;
        return spannweite;
    }
}
