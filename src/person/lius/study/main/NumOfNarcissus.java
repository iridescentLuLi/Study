package person.lius.study.main;

import java.util.Scanner;

public class NumOfNarcissus {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String Str = in.nextLine();
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        int count = 0;
        for (int i = 0; i < Str.length(); i ++){
            char co = Str.charAt(i);
            if (co == ' '){
                count = 1;
                continue;
            }
            if (count == 0)
                a.append(co);
            else
                b.append(co);
        }

        int num1 = Integer.parseInt(a.toString());
        int num2 = Integer.parseInt(b.toString());

        String Number = Narcissus(num1, num2);

        Number = Number.trim();
        for (int i = 0; i < Number.length(); i ++){
            System.out.print(Number.charAt(i));
        }
    }


    public static String Narcissus (int num1, int num2){
        String TempNum;
        int count = 0;
        String result;
        StringBuilder retu = new StringBuilder();

        for (int i = num1 + 1; i < num2;i ++ ){
            TempNum = String.valueOf(i);
            int a = TempNum.charAt(0) - '0';
            int b = TempNum.charAt(1) - '0';
            int c = TempNum.charAt(2) - '0';

            double d = Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3);
            if (i == d){
                retu.append(TempNum);
                retu.append(" ");
                count = 1;
            }
        }

        if (count == 0){
            result = "no";
        }
        else
            result = retu.toString();

        return result;
    }
}
