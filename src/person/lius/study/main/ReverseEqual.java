package person.lius.study.main;

public class ReverseEqual {
    public static void main(String args[]){
        String a = "qwqrtert";
        String b = "dqwqrter";
        int len = a.length();
        String c;
        int k = 0;

        OUT1:
        for (int i = 0; i < len ; i ++){
            c = a.substring(i,len);
            boolean d = b.contains(c);
            k = i ;
            if (d == true){
                break OUT1;
            }
        }

        String f = a.substring(0, k);
        String o = a.substring(k, len);
        boolean e = b.equals(o + f);

        System.out.println(e);
    }
}
