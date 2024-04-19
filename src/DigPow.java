public class DigPow {

    /*Some numbers have funny properties. For example:

89 --> 8¹ + 9² = 89 * 1
695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2
46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
Given two positive integers n and p, we want to find a positive integer k, if it exists, such that the sum of the digits of n raised to consecutive powers starting from p is equal to k * n.

n = 89; p = 1 ---> 1 since 8¹ + 9² = 89 = 89 * 1
n = 92; p = 1 ---> -1 since there is no k such that 9¹ + 2² equals 92 * k
n = 695; p = 2 ---> 2 since 6² + 9³ + 5⁴= 1390 = 695 * 2
n = 46288; p = 3 ---> 51 since 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51

*/
    static int pot(int x, int i){

        int pot = x;
        for (int j = 0; j < i-1; j++) {
            pot *= x;
        }


        return  pot;
    }

    public static long digPow(int n, int p) {
        int sum = 0;
        int l = 1;
        int cyfry = 1;
        int nt = n;
        while((n/l) >= 10) {
            l = l*10;
            cyfry += 1;
        };

        do {
            sum += pot(nt%10, p+cyfry-1);
            nt /= 10;
            cyfry -= 1;

        }while (cyfry > 0);

        if (sum%n == 0) return sum/n;

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(DigPow.digPow(89, 1));
        System.out.println(DigPow.digPow(92, 1));
        System.out.println(DigPow.digPow(695, 2));
        System.out.println(DigPow.digPow(46288, 3));
    }

}
