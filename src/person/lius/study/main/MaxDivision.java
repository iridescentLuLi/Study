package person.lius.study.main;

public class MaxDivision {
    public static void main(String args[]){
        int[] A = {3, 9, 10, 8, 30, 33, 20};
        int maxnum = A[0];
        int minnum = A[0];

        int b = A.length;

        for (int i = 0; i < A.length; i ++){
            if (A[i] > maxnum)
                maxnum = A[i];
            if (A[i] < minnum)
                minnum = A[i];
        }



        int[] tong = new int[maxnum - minnum +1];
        for (int i = 0; i < A.length; i ++){
            tong [A[i] - minnum] = 1;
        }

        int c = 0;
        int coun = 1;
        for (int i = 0; i < tong.length; i ++){
            if (tong[i] == 0){
                coun ++;
            }
            else {
                if (c < coun){
                    c = coun;
                    coun = 1;
                }
            }
        }

        int n = max(A);
        System.out.println(n);
        int m = 0;

    }
    public static int max(int A[]){
        int maxnum = A[0];
        int minnum = A[0];
        for (int i = 0; i < A.length; i ++){
            if (A[i] < minnum)
                minnum = A[i];
            if (A[i] > maxnum)
                maxnum = A[i];
        }

        int[] tone = new int[maxnum - minnum + 1];
        for (int i = 0; i < A.length; i ++){
            tone[A[i] - minnum] = 1;
        }

        int now = 1;
        int res = 0;
        for (int i = 0; i < tone.length; i ++){
            if (tone[i] == 0)
                now ++;
            else{
                if (res < now){
                    res = now;
                }
                now = 1;
            }
        }
        return res;
    }
}
