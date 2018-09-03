package person.lius.study.main;

public class SearchWords {
    public static void main(String[] args){
        String[] a = {"word", "is", "what", "word", "hehe"};
        String b = "word";
        int c;
        int d =0;
        for (int j = 0; j < 5; j++) {
            c = a[j].compareTo(b);
            if (c == 0)
            d ++;
        }
        System.out.println(d);
    }
}
