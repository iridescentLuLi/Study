package person.lius.study.main;

public class AddSubstitution {
    public static void main(String[] args){
        int a = 7;
        int b = 3;
        int type = 0;
        int result = 0;
        switch(type){
            case 1:{
                for (int i = 0; i < b; i++){
                    result += a;
                }
            }
            break;

            case 0:{
                for (int j = b; j <= a; j+= b){
                    result ++;
                }
            }
            break;

            case -1:{
                if (a > b){
                    while (a != b) {
                        result++;
                        b ++;
                    }
                }
                else{
                    while (a != b) {
                        result += -1;
                        b += -1;
                    }
                }
            }
            break;
        }
        System.out.println(result);
    }
}
