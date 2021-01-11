package Math;

public class MatrixCalculation {

    //<editor-fold desc="Multiplication With One Number">
    /**
     * Multiplication of a Integer Matrix with a given number
     * @param matrix The matrix that needs to be multiplied
     * @param number The number by that the matrix gets multiplied
     * @return returns multiplied matrix
     */
    public static int[][] multiplicationWithOneNumber(int[][] matrix, int number){
        int[][] tempMatrix = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                tempMatrix[i][j] = matrix[i][j] * number;
            }
        }
        return tempMatrix;
    }

    /**
     * Multiplication of a Double Matrix with a given number
     * @param matrix The matrix that needs to be multiplied
     * @param number The number by that the matrix gets multiplied
     * @return returns multiplied matrix
     */
    public static double[][] multiplicationWithOneNumber(double[][] matrix, double number){
        double[][] tempMatrix = new double[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                tempMatrix[i][j] = matrix[i][j] * number;
            }
        }
        return tempMatrix;
    }
    //</editor-fold>

    //<editor-fold desc="Merge 2 Matrix">

    /**
     * Addition of two Double Matrix with the same length
     * @param matrix1 First Matrix to Add
     * @param matrix2 Second Matrix to Add
     * @return returns the added matrix
     */
    public static double[][] mergeMatrix(double[][] matrix1, double[][] matrix2){
        if(!checkMatrixIsSame(matrix1, matrix2)){
            return null;
        }
        double[][] mergedArr = new double[matrix1.length][matrix1[0].length];
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                mergedArr[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return mergedArr;
    }
    //</editor-fold>

    //<editor-fold desc="Multiplication With Two Arrays">

    /**
     * Multiplication of two Double Matrix with another
     * @param matrix1 First Matrix to Multiply
     * @param matrix2 Second Matrix to Multiply
     * @return Multiplied Matrix
     */
    public static double[][] multiTwoMatrix(double[][] matrix1, double[][] matrix2){
        if(checkMatrixCanMultiply(matrix1, matrix2)){
            return multiArr(matrix1, matrix2);
        }
        return null;
    }
    //</editor-fold>

    //<editor-fold desc="Methods">

    /**
     * Outsourced Multiplication of two Double Matrices
     * @param matrix1 First Matrix to Multiply
     * @param matrix2 Second Matrix to Multiply
     * @return Multiplied Matrix
     */
    private static double[][] multiArr(double[][] matrix1, double[][] matrix2){
        double[][] multiArr = new double[matrix1.length][matrix2.length];
        int zeilenLength = matrix1[0].length;
        int wochenLaufzeit = matrix2.length;

        for(int i = 0; i < matrix1.length; i++){
            for(int x = 0; x < wochenLaufzeit; x++){
                double temp = 0;
                for(int j = 0; j < zeilenLength; j++) {
                    temp += matrix1[i][j] * matrix2[x][j];
                }
                multiArr[i][x] = temp;
            }
        }
        return multiArr;
    }

    /**
     * Outsourced function to check if the two Double matrices are the same length.
     * @param matrix1 First Matrix to check
     * @param matrix2 Second Matrix to check
     * @return true = all good, false = not the same length.
     */
    private static boolean checkMatrixIsSame(double[][] matrix1, double[][] matrix2){
        if(matrix1.length != matrix2.length){
            return false;
        }
        return matrix1[0].length == matrix2[0].length;
    }

    private static boolean checkMatrixCanMultiply(double[][] matrix1, double[][] matrix2){
        if(matrix1[0].length !=  matrix2[0].length){
            return false;
        }
        return true;
    }
    //</editor-fold>

}
