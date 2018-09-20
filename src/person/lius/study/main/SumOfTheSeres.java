package person.lius.study.main;

import java.util.Scanner;

public class SumOfTheSeres {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int m = in.nextInt();
            double[] mat = new double[m];
            mat[0] = n;
            double sum = mat[0];

            for (int i = 1; i < m; i ++){
                mat[i] = Math.sqrt(mat[i - 1]);
                sum += mat[i];
            }
            System.out.printf("%.2f",sum);
        }
    }
}
