import java.util.Scanner;

/**
 * Created by Ксюша on 05.11.2017.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(Plo(5,6,6,0,2,7));

    }
    public static float Plo(float x1, float y1,float x2,float y2,float x3, float y3) {


      //  float s = 0;
       float  s = Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;

        return s;
    }
}
