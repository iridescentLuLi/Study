package person.lius.study.main;

import java.util.Scanner;

public class ScannerMaxnum {
    public static void main(String[] args){
        Scanner scan1 = new Scanner(System.in);

        int n = scan1.nextInt();
        int[] mat = new int[n];
        String[] str = new String[n];

        for (int i = 0; i < n; i ++){
            mat[i] = scan1.nextInt();

            str[i] = mat[i] + "";

        }

        scan1.close();

        bubbleSort(str);//冒泡排序

        for (int i = 0; i < n; i ++){
            for (int j = 0; j < str[i].length(); j ++)
                System.out.print(str[i].charAt(j));
        }
    }


    public static String[] bubbleSort(String[] arr) {
        int len = arr.length;
        int comp;
        String temp1,temp2;

        for (int j = 0; j < len; j++) {
            for (int i = 0; i < len - 1; i ++){
                if (arr[i].length() == 2)
                    temp1 = spin(arr[i]);

                else if (arr[i].length() == 1)
                    temp1 = spin2(arr[i]);
                else
                    temp1 = arr[i];

                if (arr[i + 1].length() == 2)
                    temp2 = spin(arr[i + 1]);

                else if (arr[i + 1].length() == 1)
                    temp2 = spin2(arr[i + 1]);
                else
                    temp2 = arr[i + 1];

                comp = temp1.compareTo(temp2);

                //System.out.println(comp);
                if (comp < 0) {        // 相邻元素两两对比
                    String temp = arr[i+1];        // 元素交换
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static String spin(String spin){
        StringBuilder a = new StringBuilder();
        for (int j = 0; j < 2; j ++){
            a.append(spin.charAt(j));
        }
        a.append(spin.charAt(0));

        return a.toString();
    }

    public static String spin2(String spin){
        StringBuilder a = new StringBuilder();
        a.append(spin.charAt(0));
        a.append(spin.charAt(0));

        return a.toString();
    }
}
