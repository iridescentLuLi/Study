package person.lius.study.main;

public class FrogeJumpTheFloor {
    public static int Jump(int target){
        if (target == 1 || target == 2){
            return target;
        }
        int f1 = 1;
        int f2 = 2;
        int fn = 0;
        if (target > 2){
            for (int i = 2; i < target; i ++){
                fn = f1 + f2;
                f1 = f2;
                f2 = fn;
            }
        }
        return fn;
    }

    public static int HentaiJump(int target){
        double result = Math.pow(2,target);
        return (int)result;
    }
    public static void main(String[] args){
        int target = 7;
        System.out.print(HentaiJump(target));

    }
}

//一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
//f(n) = f(n-1) + f(n-2);