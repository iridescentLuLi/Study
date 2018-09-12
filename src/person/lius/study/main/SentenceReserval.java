package person.lius.study.main;

import java.util.Scanner;

public class SentenceReserval {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String ss = in.nextLine();
            String[] Sentence = ss.split(" ");
            int a = Sentence.length;
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < a; j ++){
                temp.append(Sentence[a - 1 - j]);
                temp.append(" ");
            }
            temp.toString().trim();
            System.out.println(temp);
        }



//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            String str = in.nextLine();
//            String arr[] = str.split(" ");
//            StringBuffer res = new StringBuffer();
//            for(int i=arr.length-1; i>0; i--){
//                res.append(arr[i]+" ");
//            }
//            res.append(arr[0]);
//            System.out.println(res.toString());
//        }
    }
}
