package person.lius.study.main;

import java.util.Scanner;

public class CalculateMaxnumCode {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] LetterAmount = new int[150];
        String Sentence = in.nextLine();
        char[] Letters = Sentence.toCharArray();

        for (int i = 0; i < Sentence.length(); i ++){
            if ((Letters[i] > 'a' && Letters[i] < 'z') || (Letters[i] > 'A' && Letters[i] < 'Z')){
                LetterAmount[Letters[i]] ++;
            }
            if (LetterAmount[Letters[i]] == 3){
                System.out.println(Letters[i]);
                break;
            }

        }

    }
}
