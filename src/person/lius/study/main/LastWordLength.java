package person.lius.study.main;

import java.util.Scanner;

public class LastWordLength {
    public static int lastwordlen(String str){
        int d = str.lastIndexOf(" ");
        return (str.length() - d - 1);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int len = lastwordlen(str);
        System.out.println(len);
    }
}
