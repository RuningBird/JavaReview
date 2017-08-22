/**
 * Created by hr on 2017/8/22.
 */

import java.lang.reflect.Array;
import java.util.*;

public class Review01 {

    public static void main(String args[]) {
//        showArray();//Arrays的一些操作
//        showForEach();//增强for循环
//        showNumberAndMath();
        showArray();//排序等操作
    }


    public static void showNumberAndMath() {
        Integer a = 5;

        Integer[] arr = {5, 4, 3, 2, 1};
        List<Integer> al;
        al = Arrays.asList(arr);
        System.out.println(Arrays.toString(al.toArray()));

        int res = (int) Collections.min(Arrays.asList(arr));
        System.out.println(res);

        Arrays.sort(arr);
        System.out.println(arr);
    }

    /*数组转list*/
    public static void array2list() {
        Integer[] arr = {1, 2, 3, 4, 5};
        List al = Arrays.asList(arr);
        System.out.println(Arrays.toString(al.toArray()));
    }

    /**
     * 增强for循环
     */
    public static void showForEach() {
        int[] arr = {1, 3, 4, 5, 6};
        for (int x : arr) {
            System.out.println(x);
        }

    }

    /* Arrays: 排序，最大值，最小值,拷贝，填充，比较*/
    public static void showArray() {
        /*数组复制*/
        Integer[] copyArr = {1, 2, 3, 4, 5, 3};
        int[] arr2 = {1, 2, 3, 4, 5};

        Integer[] cArr1 = Arrays.copyOf(copyArr, copyArr.length);//任意类型
        int[] cArr2 = Arrays.copyOf(arr2, 5);//任意类型

        System.out.println("integer copy: " + Arrays.asList(cArr1));
        System.out.println("int[] copy: " + Arrays.toString(cArr2)); // int[] 类型输出，

        /*排序*/
        int[] sortArr = {2, 1, 3, 3, 2, 5, 55, 2};
        Integer[] sortArr1 = {1, 2, 3, 4, 5, 3};
        Arrays.sort(sortArr);//可以是任意类型
        System.out.println("排序前：" + Arrays.toString(sortArr) + " 排序后：" + Arrays.toString(sortArr));
        System.out.println("排序前：" + Arrays.asList(sortArr1).toString() + " 排序后：" + Arrays.asList(sortArr1).toString());

        /*二分查找*/
        int[] searchArr = {2, 1, 4, 5, 37, 8}; //Integer[] 类型的也可以
        int pos = Arrays.binarySearch(searchArr, 37);
        System.out.println("二分查找结果为； " + pos);

        /*比较两个数组是否相等*/
        Integer[] eqArr1 = {1, 2, 3};//不能是int[]
        Integer[] eqArr2 = {1, 2, 3};

        boolean b = Arrays.deepEquals(eqArr1, eqArr2); //这个方法只能是对象类型的
        System.out.println(Arrays.asList(eqArr1) + " = = " + Arrays.asList(eqArr2) + " ?  :" + b);

        /*比较*/
        Integer cmpA = 4;
        Integer cmpB = 5;
        int cmp_res = cmpA.compareTo(cmpB);
        System.out.println(cmpA + " and " + cmpB + " compared result: " + cmp_res);
        System.out.println(cmpA + " and " + cmpB + " compared result: " + (cmpA > cmpB));

        /*数组填充*/
        int[] fillArr = new int[5];
        Arrays.fill(fillArr, 20);
        System.out.println("填充数组：" + Arrays.toString(fillArr));

//        /*map reduce里面的，先不看*/
//        int[] sptArr = {1, 2, 3, 4, 5};
//        Arrays.spliterator(sptArr);
    }
}
