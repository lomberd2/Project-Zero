package Matrizenrechnung;

public class Matrizenrechnung {


    //<editor-fold desc="Multiplication With One Number">
    public static int[][] multiplicationWithOneNumber(int[][] matrix, int number){
        int[][] merkMatrix = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                merkMatrix[i][j] = matrix[i][j] * number;
            }
        }

        return merkMatrix;
    }

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
    public static int[][] mergeMatrix(int[][] matrix1, int[][] matrix2){
        if(matrix1.length != matrix2.length){
            return null;
        }
        if(matrix1[0].length != matrix2[0].length){
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

    public static double[][] mergeMatrix(double[][] matrix1, double[][] matrix2){
        if(matrix1.length != matrix2.length){
            return null;
        }
        if(matrix1[0].length != matrix2[0].length){
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

    public static int[][] multiplicateTwoMatrix(int[][] matrix1, int[][] matrix2){
        if(matrix1.length != matrix2.length){
            return null;
        }
        if(matrix1[0].length != matrix2[0].length){
            return null;
        }

        int[][] multiArr = new int[matrix1.length][matrix1[0].length];

        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                multiArr[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }

        return multiArr;
    }

    public static double[][] multiplicateTwoMatrix(double[][] matrix1, double[][] matrix2){
        if(matrix1.length != matrix2.length){
            return null;
        }
        if(matrix1[0].length != matrix2[0].length){
            return null;
        }

        double[][] multiArr = new double[matrix1.length][matrix1[0].length];

        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                multiArr[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }

        return multiArr;
    }


}
