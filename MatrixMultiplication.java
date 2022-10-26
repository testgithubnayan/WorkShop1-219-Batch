package com.brigelabz;

import java.util.Arrays;
import java.util.Scanner;

class MatrixMultiplication {
	public static void main(String args[]) {

		int a[][] = { { 1, 5 }, { 2, 7 }, { 8, 3 } };
		int b[][] = { { 4, 1 }, { 9, 2 }, { 3, 2 } };

		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
