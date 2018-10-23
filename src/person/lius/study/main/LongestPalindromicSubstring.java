package person.lius.study.main;

public class LongestPalindromicSubstring {
    public static String longestPalindrom(String s){

        int start = 0; int end = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i ++){
            int tempstart = i; int tempend = i;
            char co = s.charAt(i);
            OUT1:
            {
                for (int j = s.length() - 1; j > i; j--) {
                    if (s.charAt(j) == co) {
                        tempend = j;
                        if (tempend - tempstart > maxLen) {
                            maxLen = tempend - tempstart;
                            start = tempstart;
                            end = tempend;
                        }
                        break OUT1;
                    }
                }
            }
        }
        String str= s.substring(start, end + 1);
        return str;
    }

    public static String longestagain(String s){
        int[] mat = new int[200];
        int maxLen = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            if (mat[s.charAt(i)] != 0){
                int temp = i + 1 - mat[s.charAt(i)];
                if (temp > maxLen) {
                    maxLen = temp;
                    start = mat[s.charAt(i)] - 1;
                    end = i;
                }
            }
            else
            mat[s.charAt(i)] = i + 1;

        }

        String str = s.substring(start, end + 1);
        return str;
    }

    public static void main(String[] args){

        String a = "bh b";
        System.out.println(longestagain(a));

    }
}
