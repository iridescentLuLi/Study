package person.lius.study.main;

public class FindTheTargetIn2Dmat {
    public static void main(String[] args){
        int target = 4;
        int[][] mat = {{1, 1, 3},{2, 3, 3}, {3, 4, 5}};
        int line = 0;
        int lenth = mat[0].length;
        int row = lenth - 1;
        while (row >= 0 && line <= lenth - 1){
            if (mat[line][row] == target){
                System.out.print("true"+line + "  " + row);
                break;
            }
            else if (mat[line][row] > target){
                row --;
            }
            else
                line ++;
        }
    }
}
