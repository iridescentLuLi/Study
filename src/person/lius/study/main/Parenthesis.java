package person.lius.study.main;

public class Parenthesis {
    public static void main(String[] args){
        String pare = "()()(())";
        char left = '(';
        char right = ')';
        int num = 0;
        int length = pare.length();
        for (int j = 0; j < length; j++){
            char co = pare.charAt(j);
            if (co == '(')
                num ++ ;
            else if (co == ')')
                num -- ;
            else
                num = -1;

            if (num < 0)
                break;
        }
        boolean i;
        if (num == 0)
            i = true;
        else
            i = false;
        System.out.println(i);
    }
}
