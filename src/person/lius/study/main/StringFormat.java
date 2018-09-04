package person.lius.study.main;

public class StringFormat {

    public static void main(String args[]){
        String A = "A%sC%sE";
        int n = 7;
        char[] arg = {'B', 'D', 'F', 'G', 'H'};
        int m = 5;
        String result = func(A, n , arg, m);
        System.out.println(result);
    }

    public static String func(String A, int n, char[] arg, int m){
        int len = A.length();
        int count = 0;
        int a = 0;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < len; i ++){
            if (A.charAt(i) == '%'){
                count = 1;
            }
            else if (A.charAt(i) == 's') {
                if (count == 1) {
                    str = str.append(arg[a]);
                    a++;
                    count = 0;
                }
            }
            else
                str.append(A.charAt(i));
        }

        while (a < m){
            str.append(arg[a]);
            a ++;
        }

        return str.toString();
    }
}
