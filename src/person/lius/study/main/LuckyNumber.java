package person.lius.study.main;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numMax = in.nextInt();

        for (int i = 1; i < numMax + 1; i ++){
            String num10Str = String.valueOf(i);
            int num10Sum = 0;
            for (int j = 0; j < num10Str.length(); j ++){

                num10Sum += Integer.valueOf(String.valueOf(num10Str.charAt(j)));
            }

            String num2Str = String.valueOf(Integer.toBinaryString(i));
            int num2Sum = 0;
            for (int j = 0; j < num2Str.length(); j ++){
                num2Sum += Integer.valueOf(String.valueOf(num2Str.charAt(j)));
            }

            if (num2Sum == num10Sum){
                System.out.println(i);
            }
        }
    }
}
