package Lesson1;

import com.sun.org.apache.xpath.internal.objects.XString;
import sun.font.TrueTypeFont;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello: Задание - 1");

        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        int raz = -9;
        boolean neg = raz < 0;
        boolean pos = raz >= 0;
        System.out.println(math1(a, b, c, d));
        System.out.println("Задание - 2");
        System.out.println(sum1(7,10));
        System.out.println("Задание - 3");
        if (neg) {
            System.out.println("NEGATIVE");
        }
        else if (pos) {
            System.out.println("POSITIVE");
        }
        System.out.println("Задание - 4");
        System.out.println(writeHello("Max"));
    }

    public static boolean sum1 (int first, int second){
        if (first + second > 10 & first + second <= 20){
            return true;
        }
        else {

            return false;
        }
    }
    public static String writeHello(String name){
        String nm = "Hello, " + name;
        return nm;
    }

    public static float math1(float q, float w, float e, float r) {
        return q * (w + (e / r));
    }




    }
//


