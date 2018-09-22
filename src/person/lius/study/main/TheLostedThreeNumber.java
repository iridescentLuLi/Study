package person.lius.study.main;
import java.util.Scanner;
import java.util.Arrays;

public class TheLostedThreeNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] numMat = new int[1000];
        int[] numLack = new int[3];
        int k = 0;
        StringBuilder numCrate = new StringBuilder();
        for (int i = 0; i < 7; i ++){
            int numTempInput = in.nextInt() - 1;
            numMat[numTempInput] = 1;
        }
        for (int i = 0; i < 10; i ++){
            if (numMat[i] == 0){
                numLack[k] = i + 1;
                k ++;
            }
        }
        Arrays.sort(numLack);
        for (int i = 0; i < 3; i ++) {
            numCrate.append(numLack[i]);
        }

        int numresult = Integer.parseInt(numCrate.toString());

        System.out.println(numresult);
    }
}
