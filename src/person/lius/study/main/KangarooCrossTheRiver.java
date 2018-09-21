package person.lius.study.main;

import java.util.Scanner;

public class KangarooCrossTheRiver {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mat[] = new int[n];
        int count = 0;
        int co = 0;

        for (int i = 0; i < n; i ++){
            mat[i] = in.nextInt();
        }

        int temp = 0;
        for (int i = 0; i < n; i ++){
            temp = i - 1;
            i += mat[i] - 1;
            count ++;
            if (temp == i){
                System.out.println(-1);
                co = 1;
                break;
            }
        }

        if (co == 0)
            System.out.println(count);

    }
}
