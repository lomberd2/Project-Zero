package Statistik;

public class Spannweite {

    /**
     * Find out the span from two Variables with int
     * @param max Highest number in the array or whatever
     * @param min Lowest number in the array or whatever
     * @return Span from min and max.
     */
    public static int getSpan(int max, int min){
        int spannweite = max - min;
        return spannweite;
    }
    /**
     * Find out the span from two Variables with double
     * @param max Highest number in the array or whatever
     * @param min Lowest number in the array or whatever
     * @return Span from min and max.
     */

    public static double getSpan(double max, double min){
        double spannweite = max - min;
        return spannweite;
    }
    /**
     * Find out the span from two Variables with long
     * @param max Highest number in the array or whatever
     * @param min Lowest number in the array or whatever
     * @return Span from min and max.
     */
    public static long getSpan(long max, long min){
        long spannweite = max - min;
        return spannweite;
    }
    /**
     * Find out the span from two Variables with float
     * @param max Highest number in the array or whatever
     * @param min Lowest number in the array or whatever
     * @return Span from min and max.
     */
    public static float getSpan(float max, float min){
        float spannweite = max - min;
        return spannweite;
    }
}