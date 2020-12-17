package Statistics;

public class Mode {

    /**
     * Takes the array modeChain to calculate the mode
     *
     * @param modeChain Array
     * @return Mode
     */
    public static double getMode(double[] modeChain) {

        double mode = 0;

        for (int j = 0; j < modeChain.length + 1; j++) {
            for (int i = 0; i < modeChain.length - 1; i++) {
                if (modeChain[i] > modeChain[i + 1]) {
                    double c = modeChain[i];
                    modeChain[i] = modeChain[i + 1];
                    modeChain[i + 1] = c;
                }
            }
        }
        double maxCount = 0;
        for (double v : modeChain) {
            int count = 0;
            for (double value : modeChain) {
                if (value == v) {
                    ++count;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = v;
            }
        }
        return mode;
    }
}
