package person.lius.study.main;

import java.util.Scanner;

public class StringSeparation {
    public static void Separate(String str){
        StringBuilder sb = new StringBuilder(str);
        if (str.length()%8 != 0){

            int zero = str.length() % 8;
            for (int i = 0; i < 8 - zero; i ++){
                sb.append('0');
            }
        }

        int n = sb.length() / 8;
        for (int i = 0; i < n; i ++){
            System.out.println(sb.substring(i*8,i*8+8));
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            Separate(str);
        }
        in.close();
    }
}

//题目描述
//•连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
//•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
//输入描述:
//连续输入字符串(输入2次,每个字符串长度小于100)
//
//输出描述:
//输出到长度为8的新字符串数组