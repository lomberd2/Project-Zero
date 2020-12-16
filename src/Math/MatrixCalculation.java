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
        int[][] merkMatrix = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                merkMatrix[i][j] = matrix[i][j] * number;
            }
        }
        return merkMatrix;
    }

    /**
     * Multiplication of a Double Matrix with a given number
     * @param matrix The matrix that needs to be multiplied
     * @param number The number by that the matrix gets multiplied
     * @return returns multiplied matrix
     */
    public static double[][] multiplicationWithOneNumber(double[][] matrix, double number){
        double[][] merkMatrix = new double[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                merkMatrix[i][j] = matrix[i][j] * number;
            }
        }
        return merkMatrix;
    }

    /*public static double[][] multiplicationWithOneNumber(double[][] matrix, int number){
        double[][] merkMatrix = new double[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                merkMatrix[i][j] = matrix[i][j] * number;
            }
        }

        return merkMatrix;
    }*/
    //</editor-fold>

    //<editor-fold desc="Merge 2 Matrix">

    /**
     * Addition of two Integer Matrix with the same length
     * @param matrix1 First Matrix to Add
     * @param matrix2 Second Matrix to Add
     * @return returns the added matrix
     */
    public static int[][] mergeMatrix(int[][] matrix1, int[][] matrix2){
        if(!checkMatrixIsSame(matrix1, matrix2)){
            return null;
        }
        int[][] mergedArr = new int[matrix1.length][matrix1[0].length];
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                mergedArr[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return mergedArr;
    }

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
     * Multiplication of two Integers Matrix with another
     * @param matrix1 First Matrix to Multiply
     * @param matrix2 Second Matrix to Multiply
     * @return Multiplied Matrix
     */
    public static int[][] multiTwoMatrix(int[][] matrix1, int[][] matrix2){
        if(!checkMatrixIsSame(matrix1, matrix2)){
            return null;
        }
        return multiArr(matrix1, matrix2);
    }

    /**
     * Multiplication of two Double Matrix with another
     * @param matrix1 First Matrix to Multiply
     * @param matrix2 Second Matrix to Multiply
     * @return Multiplied Matrix
     */
    public static double[][] multiTwoMatrix(double[][] matrix1, double[][] matrix2){
        if(!checkMatrixIsSame(matrix1, matrix2)){
            return null;
        }
        return  multiArr(matrix1, matrix2);
    }
    //</editor-fold>

    //<editor-fold desc="Methods">

    /**
     * Outsourced Multiplication of two Integer Matrices
     * @param matrix1 First Matrix to Multiply
     * @param matrix2 Second Matrix to Multiply
     * @return Multiplied Matrix
     */
    private static int[][] multiArr(int[][] matrix1, int[][] matrix2){
        int[][] multiArr = new int[matrix1.length][matrix1[0].length];
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                multiArr[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return multiArr;
    }

    /**
     * Outsourced Multiplication of two Double Matrices
     * @param matrix1 First Matrix to Multiply
     * @param matrix2 Second Matrix to Multiply
     * @return Multiplied Matrix
     */
    private static double[][] multiArr(double[][] matrix1, double[][] matrix2){
        double[][] multiArr = new double[matrix1.length][matrix1[0].length];
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                multiArr[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return multiArr;
    }

    /**
     * Outsourced function to check if the two Integer matrices are the same length.
     * @param matrix1 First Matrix to check
     * @param matrix2 Second Matrix to check
     * @return true = all good, false = not the same length.
     */
    private static boolean checkMatrixIsSame(int[][] matrix1, int[][] matrix2){
        if(matrix1.length != matrix2.length){
            return false;
        }
        if(matrix1[0].length != matrix2[0].length){
            return false;
        }
        return true;
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
        if(matrix1[0].length != matrix2[0].length){
            return false;
        }
        return true;
    }
    //</editor-fold>

}
