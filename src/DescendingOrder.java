

class DescendingOrder {
    public static int sortDesc(final int num) {
        int n = 1;
        String numS = String.valueOf(num);
        char[] numA = numS.toCharArray();



        boolean zmiana = false;
        do{
            zmiana = false;
            for (int i = 1; i < numS.length(); i++) {
                if (numA[i] > numA[i-1]){
                    char temp = numA[i];
                    numA[i] = numA[i-1];
                    numA[i-1] = temp;
                    zmiana = true;
                    break;
                }
                for (char c: numA
                     ) {
                    System.out.print(c);
                }
                System.out.println("\ni: " + i);
            }

        }while (zmiana);

        numS = "";
        System.out.println("string: " + numS);

        for (char c: numA
        ) {
            numS += c;
        }
        System.out.println("");

        System.out.println("Integer: " + Integer.valueOf(numS));
        System.out.println("int: " + (int)Integer.valueOf(numS));




        return (int)Integer.valueOf(numS);
    }
}