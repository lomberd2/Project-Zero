package Math;

public class VectorCalculation {

    /**
     * Multiplication with a Integer Vector with a given number
     * @param array The Vector that needs to be multiplied
     * @param number The number by that the vector gets multiplied
     * @return returns multiplied vector
     */
    public static int[] getMultiplicationWithOneNumber(int[] array, int number){
        int[] vector = new int[array.length];
        for (int i = 0; i < array.length; i++){
            vector[i] = array[i] * number;
        }
        return vector;
    }

    /**
     * Multiplication with a Double Vector with a given number
     * @param array The Vector that needs to be multiplied
     * @param number The number by that the vector gets multiplied
     * @return returns multiplied vector
     */
    public static double[] getMultiplicationWithOneNumber(double[] array, double number){
        double[] vector = new double[array.length];
        for (int i = 0; i < array.length; i++){
            vector[i] = array[i] * number;
        }
        return vector;
    }

    /**
     * Addition of two Integer Vector
     * @param array First Vector to add
     * @param array2 Second Vector to add
     * @return returns the added vector
     */
    public static int[] getAdditionTwoVectors(int[] array, int[] array2){
        int[] vector = new int[array.length];
        for (int i = 0; i < array.length; i++){
            vector[i] = array[i] + array2[i];
        }
        return vector;
    }

    /**
     * Addition of two Double Vector
     * @param array First Vector to add
     * @param array2 Second Vector to add
     * @return returns the added Vector
     */
    public static double[] getAdditionTwoVectors(double[] array, double[] array2){
        double[] vector = new double[array.length];
        for (int i = 0; i < array.length; i++){
            vector[i] = array[i] + array2[i];
        }
        return vector;
    }

    /**
     * Multiplication of two Integer Vector
     * @param array First Vector to multiply
     * @param array2 Second Vector to multiply
     * @return returns the multiplied Vector
     */
    public static int[] getMultiplicationTwoVectors(int[] array, int[] array2){
        int[] vector = new int[array.length];
        for (int i = 0; i < array.length; i++){
            vector[i] = array[i] * array2[i];
        }
        return vector;
    }

    /**
     * Multiplication of two Double Vector
     * @param array First Vector to multiply
     * @param array2 Second Vector to multiply
     * @return returns the multiplied Vector
     */
    public static double[][] getMultiplicationTwoVectors(double[] array, double[][] array2){
        double[][] out = new double[array.length][array2[0].length];
        for (int i = 0; i < array.length; i++){
            for(int x = 0; x < array2[0].length; x++) {
                out[i][x] = array[i] * array2[i][x];
            }
        }
        return out;
    }

    public static double getMultiplicationTwoVectors(double[] array, double[] array2){
        double out = 0;
        for (int i = 0; i < array.length; i++){
            out += array[i] * array2[i];
        }
        return out;
    }
}
