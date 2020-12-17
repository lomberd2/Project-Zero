package Math;

public class Decay {

    /**
     * takes the three variables and takes the percent to make a Decay
     *
     * @param startValue starting value
     * @param factor     factor
     * @param duration   duration
     * @return ergebnis[]
     */
    public static double getDecay(double startValue, double duration, double factor) {
        double result = 0;
        factor = 1 - (factor / 100);
        for (int i = 0; i <= duration; i++) {
            result = startValue * Math.pow(factor, i);
        }
        return result;
    }

}
