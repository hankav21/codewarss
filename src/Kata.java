/*Implement a function that adds two numbers together and returns their sum in binary.
The conversion can be done before, or after the addition.

The binary number returned should be a string.

Examples:(Input1, Input2 --> Output (explanation)))

1, 1 --> "10" (1 + 1 = 2 in decimal or 10 in binary)
5, 9 --> "1110" (5 + 9 = 14 in decimal or 1110 in binary)*/

public class Kata{

    public static String decToBin(int a){
        String bin = "";

        while (a > 1){
            bin = (a%2) + bin;
            a = a/2;
        };

        bin = a%2 + bin;
        return bin;
    }
/*
    public static String binaryAdditionZNeta(int a, int b){
        //your code here
        return Integer.toBinaryString(a + b);
    }
*/
    public static String binaryAddition(int a, int b){
        return decToBin(a+b);
    }

    public static void main(String[] args) {
        int x = 2;
        System.out.println(binaryAddition(1,0));
    }
}