package person.lius.study.main;

public class Different {
    public static void main(String args[]){
        String a = "acbdbesy";
//        char[] c = new char[256];
//
//        for (int i = 0; i < a.length(); i ++){
//            if (c[a.charAt(i)] == 0)
//                c[a.charAt(i)] = 1;
//
//                System.out.println("wtf");
//        }

        boolean n = checkDifferent(a);
        System.out.println(n);
    }

    public static boolean checkDifferent(String iniString) {
        // write code here
        char[] code = new char[256];

        for (int i = 0; i < iniString.length(); i ++){
            if (code[iniString.charAt(i)] == 0)
                code[iniString.charAt(i)] = 1;
            else{
                return false;
            }
        }
        return true;
    }
}
