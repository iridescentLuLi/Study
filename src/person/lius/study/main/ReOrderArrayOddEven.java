package person.lius.study.main;

import java.util.ArrayList;
import java.util.List;

public class ReOrderArrayOddEven {
    public static void main(String[] args){
        int[] mat = {1, 2, 3, 4, 5, 6};
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
        for (int i = 0; i < mat.length; i ++){
            if (mat[i] % 2 == 1){
                odd.add(mat[i]);
            }
            else{
                even.add(mat[i]);
            }
        }
        odd.addAll(even);
        int[] n = odd.stream().mapToInt(Integer::intValue).toArray();
        int[] result = new int[odd.size()];
        for (int i = 0; i < odd.size(); i ++){
            result[i] = odd.get(i);
        }
        int[] d = wtf(mat);
        int a = 0;
    }

    public static int[] wtf(int array[]){
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i ++){
            if (array[i] % 2 == 1){
                odd.add(array[i]);
            }
            else {
                even.add(array[i]);
            }
        }
        odd.addAll(even);
        int[] result = new int[odd.size()];
        for (int i = 0; i < odd.size(); i ++){
            result[i] = odd.get(i);
        }
        return result;
    }
}
