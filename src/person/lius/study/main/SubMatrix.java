package person.lius.study.main;

public class SubMatrix {
    public static int maxsubMatrix(int[][] mat, int n){
        int sum = 0;

        //方框的最大边长即n-i
        for (int i = 0; i < n; i ++){
            int count = 4 * (n - i - 1);
            //方框最左上角的坐标即为（j, k）
            for (int j = 0; j < i + 1; j ++){
                for (int k = 0; k < i + 1; k ++){

                    //把周长加起来，再减去4个角重复的4个点
                    for (int l = k; l < n - i + k; l ++){
                        sum += mat[j][l];
                        sum += mat[j + n - i - 1][l];
                    }
                    for (int m = j; m < n - i + j; m ++){
                        sum += mat[m][k];
                        sum += mat[m][k + n - i - 1];
                    }
                    sum = sum - mat[j][k] - mat[n - i + j - 1][n - i + k - 1] - mat[j][n - i + k - 1] - mat[n - i + j - 1][k];

                    if (sum == 0)
                        return n - i;
                    else if (sum == count)
                        return n - i; //返回最大边长，值为count

                    sum = 0;
                }
            }
        }
        return 0;
    }
    public static void main(String args[]) {
        int[][] mat = {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 1, 0}
        };

        int n = 5;
        int max = maxsubMatrix(mat, n);
        System.out.println(max);
    }
}
