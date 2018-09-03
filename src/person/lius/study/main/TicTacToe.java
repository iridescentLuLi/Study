package person.lius.study.main;

public class TicTacToe {
    public static void main(String[] args) {
        boolean d = false;
        d = bo(d);
        System.out.println("hahahaha" + d);
    }
    public static boolean bo (boolean a){
        int [][] board = {{1, 0, 1}, {1, -1, -1}, {1, -1, 0}};

//        for (int i = 0; i < 3; i ++){
//            for (int j = 0; j < 3; j++) {
//                System.out.print(board[i][j]);
//            }
//            System.out.println();
//        }

        a = false;
        OUT1:
        {

            for (int i = 0; i < 3; i++) {
                int num = 0;
                for (int j = 0; j < 3; j++) {
                    num += board[i][j];
                    if (num == 3) {
                        a = true;
                        break OUT1;
                    }
                }
            }

            for (int i = 0; i < 3; i++) {
                int num1 = 0;
                for (int j = 0; j < 3; j++) {
                    num1 += board[j][i];
                    if (num1 == 3) {
                        a = true;
                        break OUT1;
                    }
                }
            }

            int num2;
            num2 = board[0][0] + board[1][1] + board[2][2];
            if (num2 == 3) {
                a = true;
                break OUT1;
            }

            int num3 = board[0][2] + board[1][1] + board[2][0];
            if (num3 == 3) {
                a = true;
                break OUT1;
            }
        }
        return a;
    }
}
