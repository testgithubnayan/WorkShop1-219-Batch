package com.brigelabz;

import java.util.Arrays;
import java.util.Scanner;

class MatrixMultiplicationExample {
	public static void main(String args[]) {

		int a[][] = { { 1, 5 }, { 2, 7 }, { 8, 3 } };
		int b[][] = { { 4, 1 }, { 9, 2 }, { 3, 2 } };

		int c[][] = new int[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 2; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}