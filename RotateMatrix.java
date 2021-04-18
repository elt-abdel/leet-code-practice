import java.util.*;
import java.awt.*;
/* 
Given an omage represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
*/ 

/*
    1   2   3   4               13  9   5   1
    5   6   7   8               14  10  6   2
    9   10  11  12              15  11  7   3
    13  14  15  16              16  12  8   4


    topLeft -> topRight -> bottomRight -> bottomLeft -> topLeft
    (x,y)       (x,-y)      (-x,-y)         (-x, y)     (x,y)
 */ 
public class RotateMatrix {
    public static void main(String[] args) {
		int[][] matrix = randomMatrix(3, 3, 0, 9);
		printMatrix(matrix);
		rotate(matrix);
		System.out.println();
		printMatrix(matrix);
    }

    static boolean rotate(int[][] matrix){
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i]; // save top

				// left -> top
				matrix[first][i] = matrix[last-offset][first]; 			

				// bottom -> left
				matrix[last-offset][first] = matrix[last][last - offset]; 

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last]; 

				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
        return true;
    }

    public static int[][] randomMatrix(int M, int N, int min, int max) {
		int[][] matrix = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = randomIntInRange(min, max);
			}
		}
		return matrix;
	}

    public static int randomIntInRange(int min, int max) {
		return randomInt(max + 1 - min) + min;
	}

    public static int randomInt(int n) {
		return (int) (Math.random() * n);
	}

    public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 10 && matrix[i][j] > -10) {
					System.out.print(" ");
				}
				if (matrix[i][j] < 100 && matrix[i][j] > -100) {
					System.out.print(" ");
				}
				if (matrix[i][j] >= 0) {
					System.out.print(" ");
				}
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println();
		}
	}
}
