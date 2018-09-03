package person.lius.study.main;

public class StringPattern {
    public static void main(String args[]){
        String a = "jnduwslil";
        String b = "lil";
        String c;
        int len = a.length();
        int j = 0;

        OUT1:
        for (int i = 0; i < len; i ++){
            c = a.substring(0, i+1);
            boolean d = c.contains(b);
            if (d == true){
                j = i + 1 - b.length() ;
                break OUT1;
            }
        }

        System.out.println(j);
    }
}
