package person.lius.study.main;

import java.util.Scanner;

public class HotelPrice {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String inputStr = in.nextLine();
            StringBuilder num1 = new StringBuilder();
            StringBuilder num2 = new StringBuilder();
            int isSeparate = 0;
            int isError = 0;
            for (int i = 0; i < inputStr.length(); i ++){
                char co = inputStr.charAt(i);
                if (co == ' '){
                    isSeparate = 1;
                    continue;
                }
                if (co > '9' || co < '0'){
                    isError = 1;
                    break;
                }
                if (isSeparate == 0){
                    num1.append(co);
                }
                else{
                    num2.append(co);
                }
            }


            if (isError == 1 || isSeparate == 0)
                System.out.println("Error");

            else if (isError == 0) {
                int a = Integer.parseInt(num1.toString());
                int b = Integer.parseInt(num2.toString());
                System.out.println(a + b);
            }
        }
    }
}
