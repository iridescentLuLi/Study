package person.lius.study.main;

import java.util.Arrays;

public class FindPair {
    public static void main(String args[]){
        int[] A = {1, 2, 3, 4, 5, 2};
        int n = 5;
        int sum = 6;
        int result = countParis(A, n ,sum);
        System.out.println(result);
        System.out.println(Arrays.toString(A));
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
    }

    public static int countParis(int[] A, int n, int sum){
        int count = 0;
        for (int i = 0; i < n; i ++){
            for (int j = i + 1; j < n; j ++){
                if (A[i] + A[j] == sum)
                    count ++;
            }
        }
        return count;
    }
}
