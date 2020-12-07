package Lesson2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class lesson2 {

    public static void main(String[] args) {
        intArrays();
        System.out.println();
        plus3();
        System.out.println();
        na2();
        System.out.println();
        int array4[] = {32, 344, 999, 345, 65, 3, 121};
        int max = getMax(array4);
        System.out.println("Максимальное значение: "+max);
        int min = getMin(array4);
        System.out.println("Минимальное значение: "+min);



    }

    public static void plus3() {
        int[] array2 = new int[9];
        int g = 1;
        for (int i = 1; i < array2.length; i++) {
            array2[i] = g;
            g = g + 3;
            System.out.println(array2[i]);
        }
    }

    public static void intArrays() {
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1};
        for (int y = 0; y < array1.length; y++) {
            if (array1[y] == 1) {
                System.out.println(array1[y] = 0);
            } else {
                System.out.println(array1[y] = 1);
            }
        }
    }

    public static void na2() {
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] = array3[i] * 2;
                System.out.println(array3[i]);
            } else {
                System.out.println(array3[i]);
            }
        }
    }

    public static int getMax(int[] array4) {

        int maxValue = array4[0];
        for(int i=1;i < array4.length;i++){ if(array4[i] > maxValue){
            maxValue = array4[i];
        }
        }
        return maxValue;


    }
    public static int getMin(int[] array4){
        int minValue = array4[0];
        for(int i=1;i<array4.length;i++){
            if(array4[i] < minValue){
                minValue = array4[i];
            }
        }
        return minValue;
    }
}