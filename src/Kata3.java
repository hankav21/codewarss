/*In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Examples
highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
Notes
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.*/

public class Kata3 {
    public static String highAndLow(String numbers) {

        //char[] numA = numS.toCharArray();
        String[] num = numbers.split(" ");
        String min = num[0], max = num[0];
        for (String s: num) {
            if (Integer.valueOf(min) > Integer.valueOf(s) )  min = s;
            if (Integer.valueOf(max) < Integer.valueOf(s) )  max = s;
        }

        return max + " " + min;
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));  // return "5 1"
        System.out.println(highAndLow("1 2 -3 4 5")); // return "5 -3"
                System.out.println(highAndLow("1 9 3 4 -5"));//
    }
}