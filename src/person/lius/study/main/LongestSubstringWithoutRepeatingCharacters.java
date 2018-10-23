package person.lius.study.main;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int Length(String str){
        int len = str.length();
        int max = 0;

        for (int i = 0; i < len; i ++){
            int temp = 0;
            int[] mat = new int[200];
            for (int j = i; j < len; j ++){
                if (mat[str.charAt(j)] == 1){
                    break;
                }
                else {
                    mat[str.charAt(j)] = 1;
                    temp ++;
                }
            }
            if (temp > max)
                max = temp;
        }
        return max;
    }

    public static void main(String[] args){

        String str = "what the f";
        int a = Length(str);
        System.out.println(a);

    }
}

//Given a string, find the length of the longest substring without repeating characters.
//
//Example 1:
//
//Input: "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
