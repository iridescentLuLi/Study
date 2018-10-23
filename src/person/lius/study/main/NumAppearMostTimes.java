package person.lius.study.main;


public class NumAppearMostTimes {
    public static int numMost(int[] array){
        int temp = array[0];
        int count = 0;
        for (int i = 0; i < array.length; i ++){
            if (array[i] == temp)
                count ++;
            else
                count --;

            if (count < 0)
                temp = array[i];
        }

        int check = 0;
        for (int i = 0; i < array.length; i ++){
            if (array[i] == temp)
                check ++;
        }

        if (check <= array.length/2)
            return 0;

        return temp;
    }

    public static void main(String[] args){
        int[] mat = {1,2,3,2,2,2,5,4,2};
        int num = numMost(mat);
        System.out.println(num);
    }
}
