package person.lius.study.main;

public class Rotate {
    public static void main(String[] args){
        int[][] mat ={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i ++)
            for (int j = 0; j < 3; j ++){
                a[i][j] = mat[Math.abs(2-j)][i];
            }
        int c = 0;
    }

}
