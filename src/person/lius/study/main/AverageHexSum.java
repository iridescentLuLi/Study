package person.lius.study.main;

import java.util.Scanner;

public class AverageHexSum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int input = in.nextInt();

            int[] sum = new int[input - 2];
            int sumAll = 0;

            for (int j = 0; j < input - 2; j++) {
                String numStr = HexChange(input, j + 2);//将输入的数转化为各进制数
                for (int i = 0; i < numStr.length(); i++) {
                    sum[j] += Integer.valueOf(String.valueOf(numStr.charAt(i)));
                }
                sumAll += sum[j];
            }

            int gcd = Appointment(sumAll, input - 2);

            String coutStr = (sumAll / gcd + "/" + (input - 2) / gcd);

            for (int k = 0; k < coutStr.length(); k++) {
                System.out.print(coutStr.charAt(k));
            }
            System.out.println("");
        }
    }

    public static String HexChange(int num, int n){
        StringBuilder numStr = new StringBuilder();
        int tempRemainder = 0;
        while (num > 0){
            tempRemainder = num % n;
            num /= n;
            numStr.append(tempRemainder);
        }
        return numStr.toString();
    }

    //最大公约数
    public static int Appointment(int sum, int n){
        int gcd = 0;
        if (n == 0)
            gcd = sum;
        else{
            gcd = Appointment(n, sum % n);

        }
        return gcd;
    }
}
