package person.lius.study.main;

import java.util.Arrays;
import java.util.Scanner;

public class CombineTwoSets {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String mAndn = in.nextLine();
        String setA = in.nextLine();
        String setB = in.nextLine();

        int m = Integer.parseInt(String.valueOf(mAndn.charAt(0)));
        int n = Integer.parseInt(String.valueOf(mAndn.charAt(2)));

        StringBuilder strAset = new StringBuilder();
        StringBuilder strBset = new StringBuilder();

        for (int i = 0; i < m; i ++){
            strAset.append(setA.charAt(i * 2));
        }
        for (int i = 0; i < n; i ++){
            strAset.append(setB.charAt(i * 2));
        }

        strAset.append(strBset);//两数组合并

        int[] setSum = new int[strAset.length()];

        for (int i = 0; i < strAset.length(); i ++){
            setSum[i] = Integer.parseInt(String.valueOf(strAset.charAt(i)));
        }

        Arrays.sort(setSum);//排序操作

        for (int i = 0; i < (m + n); i ++){
            System.out.print(setSum[i]);
            if (i == m + n - 1)
                continue;
            System.out.print(" ");
        }
    }
}