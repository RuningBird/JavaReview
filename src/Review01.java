/**
 * Created by hr on 2017/8/22.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Review01 {

    public static void main(String args[]) {
//        showArray();
        showForEach();
    }

    /**
     * 增强for循环
     */
    public static void showForEach(){
        int[] arr = {1,3,4,5,6};
        for (int x: arr) {
            System.out.println(x);
        }

    }

    public static void showArray() {
        Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] arr2 = {1, 2, 3, 4, 5};

        int[] arr3 = {4,3,4,5};

        System.out.println(arr);
        boolean b = Arrays.deepEquals(arr, arr2);
        System.out.println(b);
    }
}
