package com.himanshu.freqcodes.DPmatrix;

import java.util.Scanner;

public class matrixsumquery {

    static int m = 4, n = 5;

    public static void main(String[] args) {

        int mat[][] = {{1, 2, 3, 4, 6},
                {5, 3, 8, 1, 2},
                {4, 6, 7, 5, 5},
                {2, 4, 8, 9, 4}};

        Scanner scn = new Scanner(System.in);
        int sx = scn.nextInt();
        int sy = scn.nextInt();
        int dx = scn.nextInt();
        int dy = scn.nextInt();

        int[][] aux = new int[m][n];

        preprocess(aux, mat);
        System.out.println("Printing the original matrix...");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println(" ");
        }

        System.out.println("Printing the processed aux matrix...");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(aux[i][j] + "  ");
            }
            System.out.println(" ");
        }

        System.out.println(sumQuery(aux, sx, sy, dx, dy));

    }

    private static void preprocess(int[][] aux, int[][] mat) {

        aux[0][0] = mat[0][0];
        for (int i = 1; i < n; i++) {
            aux[0][i] = mat[0][i] + aux[0][i - 1];
        }

        for (int i = 1; i < m; i++) {
            aux[i][0] = mat[i][0] + aux[i - 1][0];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                aux[i][j] = mat[i][j] + aux[i - 1][j] + aux[i][j - 1] - aux[i - 1][j - 1];
            }
        }
    }

    private static int sumQuery(int[][] aux, int sx, int sy, int dx, int dy) {

        if (sx == 0 && sy == 0) return aux[dx][dy];

        if (sx == 0) {
            return aux[dx][dy] - aux[dx][sy - 1];
        }

        if (sy == 0) {
            return aux[dx][dy] - aux[sx - 1][dy];
        }

        return aux[dx][dy] - aux[sx-1][dy] - aux[dx][sy-1] + aux[sx-1][sy-1];
    }
}
