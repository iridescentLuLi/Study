package person.lius.study.main;

public class StringRotation {
    public static void main(String[] args){
        String a = "abcdefghij";
        String b = a.substring(3 - 1,10);
        String c = a.substring(0, 3 - 1);
        String d = b + c;
    }
}
