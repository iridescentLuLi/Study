package person.lius.study.main;

import java.util.ArrayList;

public class SpinMat {
    public static ArrayList<Integer> PrintMaxtrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int min = Math.min(n + 1, m + 1);
        int layer = (min + 1) / 2;
        if (layer == 0 && min == 1){
            layer = 1;
        }
        for (int i = 0; i < layer; i ++){
            for (int j = i; j <= n - i; j ++){
                list.add(matrix[i][j]);
            }
            for (int k = i + 1; k <= m - i; k ++){
                list.add(matrix[k][n - i]);
            }
            for (int j = n - i - 1; j >= i; j --){
                if (m - i == i)
                    break;
                list.add(matrix[m - i][j]);
            }
            for (int k = m - i - 1; k > i; k --){
                if (n - i == i)
                    break;
                list.add(matrix[k][i]);
            }
        }
        return list;
    }

    public static void main(String[] args){
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
//        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] mat = {{1}, {2}, {3}, {4}, {5}};
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = PrintMaxtrix(mat);
        int a = mat.length;
        int b = mat[0].length;
    }
}


//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下
// 4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,
// 3,4,8,12,16,15,14,13,9,5,6,7,11,10.