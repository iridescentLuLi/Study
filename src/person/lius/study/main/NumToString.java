package person.lius.study.main;

import java.util.ArrayList;
import java.util.Arrays;

public class NumToString {
    public static String gotoString(int x){
        String sb = String.valueOf(x);
        int len = sb.length();
        ArrayList<String> list = new ArrayList<>(len);

        for (int i = 0; i < len; i ++){

            char num = sb.charAt(i);
            String test = new String();

            //判断是不是"十"位数，余数为1："十"位数，2："百"位数，0："个位数"
            int rem = (len - i - 1) % 3;

            if (rem != 1) {
                test = change1(num); //"百"位数，直接改为相应word
                list.add(test);
                if (num != '0' && rem != 0){
                    String unit100 = change4(100);
                    list.add(unit100);
                }
                if(rem == 0) {
                    int unitnum = (len - 1 - i) / 3;//如果是"个"位数，加上单位
                    String unit = change4(unitnum);
                    list.add(unit);
                }
            }

            else if(rem == 1){
                test = change2(num); //是"十"位数，改成xxx-ty
                if (test == "ten"){
                    char num2 = sb.charAt(i + 1);
                    test = change3(num2);
                    i ++;
                    int unitnum = (len - 1 - i) / 3;//如果是"个"位数，加上单位
                    String unit = change4(unitnum);
                    list.add(test);
                    list.add(unit);
                    continue;
                }
                list.add(test);
            }
        }

        StringBuilder s = new StringBuilder();
        for(String ii : list){
            s.append(ii);
        }

        return s.toString().trim();
    }

    public static String change1(char num){
        char code = num;
        String word = new String();
        switch (code) {
            case '1':
                word = "One ";
                break;
            case '2':
                word = "Two ";
                break;
            case '3':
                word = "Three ";
                break;
            case '4':
                word = "Four ";
                break;
            case '5':
                word = "Five ";
                break;
            case '6':
                word = "Six ";
                break;
            case '7':
                word = "Seven ";
                break;
            case '8':
                word = "Eight ";
                break;
            case '9':
                word = "Nine ";
                break;
            case '0':
                word = "";
                break;
        }

        return word;
    } //非"十"位数数字改单词

    public static String change2(char num){
        char code = num;
        String word = new String();
        switch (code) {
            case '1':
                return "ten";
            case '2':
                word = "Twenty ";
                break;
            case '3':
                word = "Thirty ";
                break;
            case '4':
                word = "Forty ";
                break;
            case '5':
                word = "Fifty ";
                break;
            case '6':
                word = "Sixty ";
                break;
            case '7':
                word = "Seventy ";
                break;
            case '8':
                word = "Eighty ";
                break;
            case '9':
                word = "Ninety ";
                break;
            case '0':
                word = "";
                break;
        }

        return word;
    } //"十"位数字改单词

    public static String change3(char num){
        char code = num;
        String word = new String();
        switch (code) {
            case '1':
                return "Eleven ";
            case '2':
                word = "Twelve ";
                break;
            case '3':
                word = "Thirteen ";
                break;
            case '4':
                word = "Fourteen ";
                break;
            case '5':
                word = "Fifteen ";
                break;
            case '6':
                word = "Sixteen ";
                break;
            case '7':
                word = "Seventeen ";
                break;
            case '8':
                word = "Eighteen ";
                break;
            case '9':
                word = "Ninety ";
                break;
            case '0':
                word = "Ten ";
                break;
        }
        return word;
    } //"十几"数字改单词

    public static String change4(int unit){

        //String word = new String();
        switch (unit){
            case 0:
                return "";
            case 1:
                return "Thousand,";
            case 2:
                return "Million,";
            case 3:
                return "Billion,";
            case 4:
                return "Trillion,";
            case 5:
                return "Jillion,";
            case 100:
                return "Hundred ";
        }
        return "error!";
    } //单位


    public static void main(String args[]){
        int x = 1555555;
        String str = gotoString(x);
        System.out.print(str);
    }
}
