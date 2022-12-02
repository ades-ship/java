import java.util.*;
import java.lang.Math;
class demo {
    public static void main(String []args) {
        double log=Math.log(64);
        double pow=Math.pow(2,Math.round(log));
        if(pow==100) {
            System.out.println(pow);
        }
        //System.out.println(log);
    }
}
