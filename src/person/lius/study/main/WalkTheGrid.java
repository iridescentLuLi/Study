package person.lius.study.main;

import java.util.Scanner;

public class WalkTheGrid {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int[][] numMap = new int[x + 1][y + 1];

        for (int i = 0; i < x + 1; i ++){
            for (int j = 0; j < y + 1; j ++){
                if (i == 0){
                    numMap[i][j] = 1;
                }
                else if (j == 0){
                    numMap[i][j] = 1;
                }
                else
                    numMap[i][j] = numMap[i - 1][j] + numMap[i][j - 1];
            }
        }

        System.out.println(numMap[x][y]);
    }
}
