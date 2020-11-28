package Practice;

/**
 * @author Zerlaer
 * @date 2020/11/28 18:21
 * @name JavaLearn
 * @blog zerlaer.com
 */


public class AddSumN {
    public static void main(String[] args) {
        System.out.println(addSum(10));
        System.out.println(addSumOdd(10));
        System.out.println(addSumEven(10));
    }

    // 计算1到n之和

    public static int addSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    // 计算1到n奇数之和

    public static int addSumOdd(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    // 计算1到n偶数之和

    public static int addSumEven(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

