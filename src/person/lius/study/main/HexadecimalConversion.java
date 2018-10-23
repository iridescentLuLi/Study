package person.lius.study.main;

import java.util.Scanner;

public class HexadecimalConversion {
    public static int Convers(String str){
        int c = Integer.parseInt(str.substring(2), 16);
        return c;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            System.out.println(Convers(str));
        }
        in.close();
    }
}

//题目描述
//写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
//
//输入描述:
//输入一个十六进制的数值字符串。
//
//输出描述:
//输出该数值的十进制字符串。