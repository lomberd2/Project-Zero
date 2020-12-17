package Statistics;

public class Maximum {
    /**
     * Find out the Highest number with int
     *
     * @param zahl1 Variable one
     * @param zahl2 Variable two
     * @return Highest number
     */
    public static int getMaximum(int zahl1, int zahl2) {
        return Math.max(zahl1, zahl2);
    }

    /**
     * Find out the Highest number with double
     *
     * @param zahl1 Variable one
     * @param zahl2 Variable two
     * @return Highest number
     */
    public static double getMaximum(double zahl1, double zahl2) {
        return Math.max(zahl1, zahl2);
    }

    /**
     * Find out the Highest number with long
     *
     * @param zahl1 Variable one
     * @param zahl2 Variable two
     * @return Highest number
     */
    public static long getMaximum(long zahl1, long zahl2) {
        return Math.max(zahl1, zahl2);
    }

    /**
     * Find out the Highest number with float
     *
     * @param zahl1 Variable one
     * @param zahl2 Variable two
     * @return Highest number
     */
    public static float getMaximum(float zahl1, float zahl2) {
        return Math.max(zahl1, zahl2);
    }

    /**
     * Find the highest number in an double array
     *
     * @param numbers input
     * @return highest number
     */
    public static double getMaximum(double[] numbers) {
        double max = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            max = Math.max(numbers[i], numbers[i + 1]);
        }
        return max;
    }
}