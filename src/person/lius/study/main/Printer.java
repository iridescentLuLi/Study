package person.lius.study.main;

public class Printer {
    public static void main(String[] args){
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int[] a = new int[3 * 4];
        int k = 0;
        for (int i = 0; i < 4 ;i ++)
            for (int j = 0; j < 3; j ++){
                if ((i % 2) == 1)
                    k = 2 - j;
                else
                    k = j;

                a[i * 3 + j] = mat[i][k];
            }
            int d = 0 % 2;
        int c = 0;
    }
}
