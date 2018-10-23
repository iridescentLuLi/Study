package person.lius.study.main;

public class ZigZagConversion {
    public static String transform(String str, int numLine){
        StringBuilder[] string = new StringBuilder[numLine];
        for (int i = 0; i < numLine; i ++){
            string[i] = new StringBuilder();
        }
        int add = 1;//行数加为1； 减为0；
        int level = 0;

        for (int i = 0; i < str.length(); i ++){

            string[level].append(str.charAt(i));

            if (level == 0){
                add = 1;
            }
            else if (level == numLine - 1)
                add = 0;

            if (numLine < 2)
                continue;
            else if (add == 1)
                level ++;
            else
                level --;
        }
        if (numLine < 2)
            return string[level].toString();
        for (int i = 1; i < numLine; i ++){
            string[0].append(string[i]);
        }
        return string[0].toString();
    }

    public static void main(String[] args){

        String s = "PAYPALISHIRING";
        int n = 6;
        String str = transform(s, n);
        System.out.println(str);
    }
}


//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like
// this: (you may want to display this pattern in a fixed font for better legibility)
//
//P   A   H   N
//A P L S I I G
//Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"
//
//Write the code that will take a string and make this conversion given a number of rows:
//
//string convert(string s, int numRows);
//Example 1:
//
//Input: s = "PAYPALISHIRING", numRows = 3
//Output: "PAHNAPLSIIGYIR"
//Example 2:
//
//Input: s = "PAYPALISHIRING", numRows = 4
//Output: "PINALSIGYAHRPI"
//Explanation:
//
//P     I    N
//A   L S  I G
//Y A   H R
//P     I