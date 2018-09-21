package person.lius.study.main;

import java.util.Scanner;

public class GropingID {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IDnumber = in.nextLine();
            char[] IDnumberCode = IDnumber.toCharArray();
            StringBuilder GropedID = new StringBuilder();
            int lenth = IDnumber.length();


            for (int i = 0; i < lenth; i ++){
                if (IDnumberCode[i] == ' '){
                    continue;
                }

                GropedID.append(IDnumberCode[i]);
                if (i == 5 || i == 13){
                    GropedID.append(' ');
                }
            }

            System.out.println(GropedID.toString());
        }
    }
}