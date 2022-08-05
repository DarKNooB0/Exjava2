package ex12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.SimpleTimeZone;

public class Ex12 {
    public static void main(String[] args) {
   //     System.out.println("Math.pow(3,2) =" + Math.pow(3,2));
  //      System.out.println("Math.sqr(9) =" + Math.sqrt(9));
 //       System.out.println("Math.max(5,10) =" + Math.max(5,10));
//        System.out.println("Math.abs(-10) =" + Math.abs(-10));

        //Method in Class calendar
        Calendar calen = Calendar.getInstance();
        System.out.println("Current DataTime" + calen.getTime());

        //fomat DateTime in ClasS SimpledataFormat
        SimpleDateFormat df = new SimpleDateFormat("d/MM/yyyy HH:mm:ss");
        System.out.println("Current DateTime: " + df.format(calen.getTime()));
    }
}
