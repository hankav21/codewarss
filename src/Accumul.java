import java.util.Arrays;

public class Accumul {
    
    public static String accum(String s) {
     
        String[] c = s.split("");
        //Arrays.sort(c);
        int i = 0;
        s = "";
        for (String str: c) {
            str = str.toLowerCase();
            if(!s.endsWith(str) || !s.endsWith(str.toUpperCase())){
                s += "-" + str.toUpperCase();
                for (int j = 0; j < i; j++) {
                    s += str.toLowerCase();
                }
                i++; 
            } 
            System.out.println(s); 
        }
        
        return s.substring(1);
    }

    public static void main(String[] args) {
        System.out.println(Accumul.accum("ZpglnRxqenU"));//, "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
        System.out.println(Accumul.accum("NyffsGeyylB"));//, "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb");
        System.out.println(Accumul.accum("MjtkuBovqrU"));//, "M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu");
        System.out.println(Accumul.accum("EvidjUnokmM"));//, "E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm");
        System.out.println(Accumul.accum("HbideVbxncC"));//, "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc");
  
    }
}