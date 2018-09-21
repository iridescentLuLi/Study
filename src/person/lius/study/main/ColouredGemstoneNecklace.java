package person.lius.study.main;

import java.util.Scanner;

public class ColouredGemstoneNecklace {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            String Necklace = in.nextLine();
            int len = Necklace.length();
            int max = 0;
            for (int i = 0; i < len; i ++){
                int isA = 0;
                int isARev = 0;
                int isB = 0;
                int isBRev = 0;
                int isC = 0;
                int isCRev = 0;
                int isD = 0;
                int isDRev = 0;
                int isE = 0;
                int isERev = 0;
                int sumFiveGemstone = 0;
                int sumFiveGemstoneRev = 0;
                for (int j = i; j < len + i; j ++){
                    int k = j % len;
                    int reverse = len - k - 1;
                    char count = Necklace.charAt(k);
                    char countRev = Necklace.charAt(reverse);
                    switch (count){
                        case 'A': isA = 1;break;
                        case 'B': isB = 1;break;
                        case 'C': isC = 1;break;
                        case 'D': isD = 1;break;
                        case 'E': isE = 1;break;
                    }
                    if (isA==1 && isB==1 && isC==1 && isD==1 && isE==1){
                        sumFiveGemstone = len - j + i - 1;
                    }

                    switch (countRev){
                        case 'A': isARev = 1;break;
                        case 'B': isBRev = 1;break;
                        case 'C': isCRev = 1;break;
                        case 'D': isDRev = 1;break;
                        case 'E': isERev = 1;break;
                    }
                    if (isARev==1 && isBRev==1 && isCRev==1 && isDRev==1 && isERev==1){
                        sumFiveGemstoneRev = len - j + i - 1;
                    }

                    if (sumFiveGemstone > max){
                        max = sumFiveGemstone;
                    }
                    if (sumFiveGemstoneRev > max){
                        max = sumFiveGemstoneRev;
                    }
                }
            }
            System.out.println(max);

        }
    }
}
