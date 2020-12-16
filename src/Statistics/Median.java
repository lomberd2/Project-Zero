package Statistics;

import Menu.IO;

public class Median {
    /*
	  "test"
	 public static void main(double median) {
		double [] numberchain = new double [8];

		for (int i = 0; i < numberchain.length; i++) {
			numberchain[i] = IO.readDouble();
		}
		getmedian(numberchain);
		System.out.println(median);
	}

				Zahlenreihe muss im vorhinein eingelesen werden
	 */

    /**
     * takes the array 'numberChain' to calculate the median
     * @param numberChain array
     * @return median
     */
    public static double getMedian(double [] numberChain) {

        double median;
        int index;
        if (numberChain.length % 2 == 0) {
            index = ((numberChain.length/2 - 1) + (numberChain.length/2)) / 2;
            median = numberChain[index];
        } else {
            index = (((numberChain.length + 1) / 2) - 1);
            median = numberChain[index];
        }

        return median;
    }
}
