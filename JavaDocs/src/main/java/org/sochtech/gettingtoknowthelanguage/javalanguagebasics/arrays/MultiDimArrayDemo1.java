package org.sochtech.gettingtoknowthelanguage.javalanguagebasics.arrays;

public class MultiDimArrayDemo1 {
    static void main() {
        // Multidimensional arrays (2D array)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        IO.println("3X3 Matrix:");

//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                IO.print(matrix[i][j] + " ");
//            }
//
//            IO.println();    // New line after each row
//        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                IO.print(anInt + " ");
            }

            IO.println();    // New line after each row
        }
    }
}
