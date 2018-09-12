package person.lius.study.main;

public class Robot {
    public static void main(String args[]){
        int m = 5;
        int n = 5;
        int[][] mat = {
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 1, 0, 1, 1},
                {1, 1, 1, 1, 1}
        };

        int res = countWays(mat, m, n);
        System.out.println(res);
    }

    public static int countWays(int[][] map, int x, int y){
        for (int i = 0; i < x; i ++){
            for (int j = 0; j < y; j++){
                if (map[i][j] == 0)//不通的路，还是0不变,直接下一个数
                    continue;

                if (i == 0) {
                    if (j == 0){
                        if (map[i][j] == 0)
                            return 0;//如果第一格就是0，直接返回0，否则继续
                        continue;
                    }
                    if (map[i][j] != 0)
                        map[i][j] = map[i][j - 1];//第一行直接等于左边,不通的话直接下一格
                    else continue;
                }
                if (j == 0 && i > 0){
                    if(map[i][j] != 0)
                        map[i][j] = map[i - 1][j];  //第一列等于上边，不通的话仍为0,下一个数；
                    else continue;
                }
                if (i > 0 && j > 0)
                    map[i][j] = map[i][j - 1] + map[i - 1][j];
            }
        }
        return map[x - 1][y - 1];
    }
}
