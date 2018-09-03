package person.lius.study.main;

public class Reverse {
    public static void main(String args[]){
        String str1 = "this is cool";

        StringBuilder str2 = new StringBuilder(str1);
        String afterreverse = str2.reverse().toString();
        System.out.println(" ");

    }
}
