package Statistics;

public class Minimum {
    /**
     * Find out the Lowest number with int
     *
     * @param zahl1 Variable one
     * @param zahl2 Variable two
     * @return Lowest number
     */
    public static int getMinimum(int zahl1, int zahl2) {
        return Math.min(zahl1, zahl2);
    }

    /**
     * Find out the Lowest number with double
     *
     * @param zahl1 Variable one
     * @param zahl2 Variable two
     * @return Lowest number
     */
    public static double getMinimum(double zahl1, double zahl2) {
        return Math.min(zahl1, zahl2);
    }

    /**
     * Find out the Lowest number with long
     *
     * @param zahl1 Variable one
     * @param zahl2 Variable two
     * @return Lowest number
     */
    public static long getMinimum(long zahl1, long zahl2) {
        return Math.min(zahl1, zahl2);
    }

    /**
     * Find out the Lowest number with float
     *
     * @param zahl1 Variable one
     * @param zahl2 Variable two
     * @return Lowest number
     */
    public static float getMinimum(float zahl1, float zahl2) {
        return Math.min(zahl1, zahl2);
    }

    /**
     * Find the lowest number in an double array
     *
     * @param numbers input
     * @return lowest number
     */
    public static double getMinimum(double[] numbers) {
        double min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }
}
