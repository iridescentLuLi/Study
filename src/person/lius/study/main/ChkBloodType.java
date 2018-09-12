package person.lius.study.main;

import java.util.ArrayList;
import java.util.Arrays;

public class ChkBloodType {
    public static String[] chkblood(String father,String mother){
        ArrayList<String> child = new ArrayList();
        int fa = change(father);
        int mo = change(mother);

        int num = fa + mo;

        switch (num){
            case 1:
                if (mo > fa){
                    child.add(mother);
                    child.add(father);
                }
                else {
                    child.add(father);
                    child.add(mother);
                }
                break;
            case 2:
                if (mother == father){
                    child.add(mother);
                    child.add("O");
                }
                else {
                    child.add("A");
                    child.add("AB");
                    child.add("B");
                    child.add("O");
                }
                break;
            case 0:
                if (mother == father){
                    child.add("O");
                }
                else {
                    child.add("A");
                    child.add("AB");
                    child.add("B");
                }
                break;
            case -1:
                child.add("A");
                child.add("B");
                break;
        }

        int size=child.size();
        String[] result = (String[])child.toArray(new String[size]);
        return result;
    }

    public static int change(String type) {
        int num = 0;
        switch (type){
            case "A":
                num = 1;
                break;
            case "B":
                num = 1;
                break;
            case "AB":
                num = -1;
                break;
            case "O":
                num = 0;
                break;
        }
        return num;
    }

    public static void main(String args[]){
        String mother = "A";
        String father = "A";
        String[] child = new String[4];

        child = chkblood(mother,father);
        System.out.println(Arrays.toString(child));
    }
}
