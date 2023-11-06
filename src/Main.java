import java.util.Arrays;

public class Main {
    public static int calculate(int n, int left, int right) {
        final int ROTATE = 1;
        if (left - 1 == -1) {
            return 1;
        }
        if (right + 1 == n + 1) {
            return 1;
        }
        if (left < right)
            return Math.min(Math.abs(-1 - left), Math.abs(n + 1 - right));

        if (left - right - 1 == 0)
            return Math.min(Math.abs(-1 - right), Math.abs(n + 1 - left));

        int tmp = (left - right - 1);
        if (tmp % 2 == 0)
            return Math.min(Math.abs(-1 - right), Math.abs(n + 1 - left)) + ROTATE + tmp / 2;
        else {
            tmp = tmp / 2;
            left = left - (tmp + 1);
            right = right + tmp;
            return Math.min(Math.abs(-1 - right), Math.abs(n + 1 - left));
        }
    }

    public static void main(String[] args) {
        System.out.println(calculate(3, 3, 1));
    }
}

//        System.out.println("PASS 1");
//                while (true){
//                if (left - 1 == right || right+1 == left){
//                int tmp = right;
//                right = left;
//                left = tmp;
//                }
//                if (left-1>=0)
//                left--;
//                else
//                return answer+1;
//                if (left - 1 == right || right+1 == left){
//                int tmp = right;
//                right = left;
//                left = tmp;
//                }
//                if (right+1<=n+1)
//                right++;
//                else
//                return answer+1;
//                answer++;
//                System.out.println("ASW ++ ");
//                return -1;
//                }