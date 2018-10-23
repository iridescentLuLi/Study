package person.lius.study.main;

import java.util.ArrayList;

public class TheLargestKNum {
    public static ArrayList<Integer> Solution(int [] mat, int k){
        ArrayList<Integer> list = new ArrayList<Integer>();

        if (k >= mat.length){
            for (int i = 0; i < mat.length; i ++){
                list.add(mat[i]);
            }
            return list;
        }

        for (int i = 0; i < k; i ++){
            for (int j = 0; j < mat.length - i - 1; j ++){
                if (mat[j] < mat[j + 1]){
                    int temp = mat[j];
                    mat[j] = mat[j + 1];
                    mat[j + 1] = temp;
                }
            }
            list.add(mat[mat.length - i - 1]);
        }
        return list;

    }

    public static void main(String[] args){

        int[] mat = {4,5,1,6,2,7,3,8};
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = Solution(mat, 4);
        int a = 0;
    }
}
