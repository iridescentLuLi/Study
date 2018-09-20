package person.lius.study.main;

import java.util.ArrayList;
import java.util.Scanner;

public class TakePartOfNum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> Str = new ArrayList<>();
        for (int i = 0; i < n + 1; i ++){
            Str.add(in.nextLine());
        }

        String[] number = new String[n];

        String temp;
        for (int i = 1; i < n + 1; i ++){
            temp = Str.get(i);
            number[i - 1] = Amount(temp);
            int numformat = Integer.parseInt(number[i - 1]);
            System.out.println(numformat);
        }
    }

    public static String Amount(String str){
        int len = str.length();
        int[] count = new int[10];
        int numE = 0;
        int numO = 0;
        int numF = 0;
        int numS = 0;
        int numH = 0;
        for (int i = 0; i < len; i ++){
            char co = str.charAt(i);
            switch (co){
                case 'Z': count[0] ++;
                    break;
                case 'W': count[2] ++;
                    break;
                case 'H': numH ++;
                    break;
                case 'U': count[4] ++;
                    break;
                case 'X': count[6] ++;
                    break;
                case 'G': count[8] ++;
                    break;
                case 'E': numE ++;
                    break;
                case 'O': numO ++;
                    break;
                case 'F': numF ++;
                    break;
                case 'S': numS ++;
                    break;
            }
        }

        count[1] = numO - count[0] - count[2] - count[4];
        count[3] = numH - count[8];
        count[5] = numF - count[4];
        count[7] = numS - count[6];
        count[9] = numE - count[1] - count[0] - 2 * count[3] - count[5] - 2 * count[7] - count[8];

        String temp = Translate(count);
        return temp;
    }//统计各个数字的数量并返回号码本身

    public static String Translate(int[] mat){
        StringBuilder Num = new StringBuilder();
            for (int j = 0;j < mat[0]; j ++){
                Num.append('0');
            }
            for (int j = 0;j < mat[1]; j ++){
                Num.append('1');
            }
            for (int j = 0;j < mat[2]; j ++){
                Num.append('2');
            }
            for (int j = 0;j < mat[3]; j ++){
                Num.append('3');
            }
            for (int j = 0;j < mat[4]; j ++){
                Num.append('4');
            }
            for (int j = 0;j < mat[5]; j ++){
                Num.append('5');
            }
            for (int j = 0;j < mat[6]; j ++){
                Num.append('6');
            }
            for (int j = 0;j < mat[7]; j ++){
                Num.append('7');
            }
            for (int j = 0;j < mat[8]; j ++){
                Num.append('8');
            }
            for (int j = 0;j < mat[9]; j ++){
                Num.append('9');
            }
        return Num.toString();
    }//翻译成  号码
}
