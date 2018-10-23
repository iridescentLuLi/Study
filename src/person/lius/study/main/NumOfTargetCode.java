package person.lius.study.main;

import java.util.Scanner;



public class NumOfTargetCode {
    public static int NumOfCode(String str, char co){
        int sum = 0;
        for (int i = 0; i < str.length() - 2; i ++){
            if (str.charAt(i) == co)
                sum ++;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char co = str.charAt(str.length() - 1);
        int result = NumOfCode(str, co);


        int a = 0;
    }
}
