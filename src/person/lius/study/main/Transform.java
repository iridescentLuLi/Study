package person.lius.study.main;

public class Transform {
    public static void main(String[] args){
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int a,b,c = 3;
        for (int i = 0; i < c; i ++)
            for (int j = 0; j < i; j ++) {
                a = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = a;
            }
        for (int n = 0; n < c; n ++) {
            for (int m = 0; m < (c/2) ; m++){
                b = mat[n][m];
                mat[n][m] = mat[n][c-1-m];
                mat[n][c-1-m] = b;
            }
        }
        int d = 0;
    }
}
