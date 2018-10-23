package person.lius.study.main;

public class MedianofTwoSortedArrays {

    public static double findmedia(int[] m1, int[] m2){

        if (m1.length > m2.length){
            int[] temp = m1;
            m1 = m2;
            m2 = temp;
        }

        int minRight = 0;
        int maxLeft = 0;
        if (m1.length == 0){
            if (m2.length <= 1){
                return m2[0];
            }
            maxLeft = m2[m2.length / 2 - 1];
            minRight = m2[m2.length / 2];

        }
        else if (m1.length == 1){
            if (m2.length <= 1){
                maxLeft = m1[0];
                minRight = m2[0];
            }
            else {
                maxLeft = m2[m2.length / 2];
                minRight = m2[m2.length / 2 - 1];
                if (m1[0] > minRight && m1[0] < maxLeft)
                    minRight = m1[0];
            }

        }
        else {
            int r1 = m1.length / 2;
            int r2 = m2.length / 2;
            if (m1[r1] <= m2[r2])
                minRight = m1[r1];
            else
                minRight = m2[r2];
            if (m1[r1 - 1] >= m2[r2 - 1])
                maxLeft = m1[r1 - 1];
            else
                maxLeft = m2[r2 - 1];
            if (r1 == 0) {

            }

            int temp1 = r1;
            int temp2 = r2;
            if (m1[temp1] <= m2[temp2 - 1]) {
                while (m1[temp1] <= m2[temp2 - 1]) {
                    int temp = m1[temp1];
                    m1[temp1] = m2[temp2 - 1];
                    m2[temp2 - 1] = temp;
                    minRight = m1[temp1];
                    maxLeft = temp;
                    temp1++;
                    temp2--;
                    if (temp1 >= m1.length - 1)
                        break;
                }
            } else {
                while (m2[temp2] <= m1[temp1 - 1]) {
                    int temp = m2[temp2];
                    m2[temp2] = m1[temp1 - 1];
                    m1[temp1 - 1] = temp;
                    maxLeft = temp;
                    minRight = m2[temp2];
                    if (minRight > m2[temp2 + 1])
                        minRight = m2[temp2 + 1];
                    temp2++;
                    temp1--;

                    if (temp1 < 1)
                        break;
                }
            }
        }

        if ((m1.length + m2.length) % 2 == 0) {
            return (double) (maxLeft + minRight) / 2;
        }
        else
            return (double) minRight;

    }

    public static double findagain(int[] a, int[] b){
        if (a.length > b.length){
            int[] temp = b;
            b = a;
            a = temp;
        }
        int n = a.length;
        int m = b.length;
        int halfa = n / 2;
        int halfb = m / 2;
        if (n % 2 == 1 && m % 2 == 1 && halfa != 0){
            halfa ++;
        }

        int left = 0;
        if (n != 0 && halfa > 0)
            left = a[halfa - 1];
        int right = b[halfb];

        if (n == 0){
            if (m % 2 == 1){
                if (m == 1)
                    return b[0];
                return b[halfb];
            }
            if (m % 2 == 0 && m > 1){
                return (b[halfb] + b[halfb - 1])/2.0;
            }
        }
        else if (n == 1){
            if (m % 2 == 1){
                if (m == 1)
                    return (a[0] + b[0])/2.0;
                if (a[0] > b[halfb + 1])
                    return (b[halfb] + b[halfb + 1])/ 2.0;
                else if (a[0] < b[halfb - 1])
                    return (b[halfb] + b[halfb - 1])/2.0;
                else
                    return (b[halfb] + a[0])/ 2.0;
            }
            if (m % 2 == 0){

                if (a[0] > b[halfb - 1] && a[0] < b[halfb])
                    return a[0];
                else if (a[0] >= b[halfb])
                    return b[halfb];
                else
                    return b[halfb - 1];
            }
        }
        halfa --;
        int tempb = halfb;
        int tempa = halfa;
        while (b[tempb] < a[tempa]) {
            int temp = b[tempb];
            b[tempb] = a[tempa];
            a[tempa] = temp;
            right = b[tempb];
            if (right > b[tempb + 1] && tempb+1 < b.length)
                right = b[tempb + 1];
            tempb++;
            tempa --;
            if (tempa == -1)
                break;
        }

        if (tempb == halfb && tempa == halfa) {

            while (a[tempa + 1] < b[tempb - 1]) {
                int temp = a[tempa + 1];
                a[tempa + 1] = b[tempb - 1];
                b[tempb - 1] = temp;
                right = a[tempa + 1];
                left = b[tempb - 1];
                tempa++;
                tempb--;
                if (tempb == 0 || tempa + 2 > a.length)
                    break;
            }
        }
        if (a[halfa] < b[halfb - 1])
            left = b[halfb - 1];
        if (b[halfb] > a[halfa + 1])
            right = a[halfa + 1];
        int f= 0;
        return right;
    }


    public static void main(String[] args){

        int[] mat1 = {1, 2, 3};
        int[] mat3 = {4, 5};
        int[] mat4 = {-1, 3};
        int[] mat2 = {4, 5, 6, 7};
        int[] mat5 = {2};
        int[] mat6 = {};
        double c = findagain(mat3, mat1);
        System.out.println(c);
    }

}
