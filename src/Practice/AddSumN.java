package Practice;

/**
 * The type Add sum n.
 *
 * @author Zerlaer
 * @date 2020 /11/28 18:21
 * @name JavaLearn
 * @blog zerlaer.com
 */
public class AddSumN {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(addSum(10));
        System.out.println(addSumOdd(10));
        System.out.println(addSumEven(10));
    }

    // 计算1到n之和

    /**
     * Add sum int.
     *
     * @param n the n
     * @return the int
     */
    public static int addSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    // 计算1到n奇数之和

    /**
     * Add sum odd int.
     *
     * @param n the n
     * @return the int
     */
    public static int addSumOdd(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2!=0) {
                sum += i;
            }
        }
        return sum;
    }

    // 计算1到n偶数之和

    /**
     * Add sum even int.
     *
     * @param n the n
     * @return the int
     */
    public static int addSumEven(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2==0) {
                sum += i;
            }
        }
        return sum;
    }
}
