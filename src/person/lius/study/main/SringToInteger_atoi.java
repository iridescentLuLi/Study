package person.lius.study.main;

public class SringToInteger_atoi {

    public static int myAtoi(String str){
        str.trim();
        int neg = 0;
        if (str.charAt(0) == '-'){
            neg = 1;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < str.length(); i ++){
            char co = str.charAt(i);
            if (co < '0' && co > '9'){
                break;
            }
            result.append(co);
        }
        result.reverse();
        int n = Integer.valueOf(result.toString());
        if (neg == 1){
            n = - n;
        }
        return n;
    }

    public static void main(String[] args){
        String str = "-91283472332";
        int result = myAtoi(str);
        System.out.println(result);
    }
}
