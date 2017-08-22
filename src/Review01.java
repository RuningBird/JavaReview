/**
 * Created by hr on 2017/8/22.
 */

import java.util.*;

public class Review01 {

    public static void main(String args[]) {
//        showArray();//Arrays的一些操作
//        showForEach();//增强for循环
//        showNumberAndMath();
//        showArray();//Arrays;排序等操作
//        showMath(); //数学类操作
        showCharacter();//字符类操作
    }

    /* Character类 :判断是否数字、字符、大小写，转换大小写等*/
    public static void showCharacter() {
        Character c1 = new Character('a');
        Character c2 = 'b';
        System.out.println(c1 + ":" + c2);

        /*判断是否是数字*/
        char cNum = '2';
        boolean isNum = Character.isDigit(cNum);
        System.out.println(cNum + " is a character ?:" + isNum);

        /*判断是否是字符*/
        char cChar = 'a';
        boolean isChar = Character.isLetter(cChar);
        boolean isLowerCase = Character.isLowerCase(cChar);
        boolean isUpperCase = Character.isUpperCase(cChar);

        System.out.println(cChar + " is a Character ? :" + isChar);
        System.out.println(cChar + " is a LowerCase ? :" + isLowerCase);
        System.out.println(cChar + " is a UpperCase ? :" + isUpperCase);

        /*转换大小写*/
        System.out.println('a' + " upperCase is :" + Character.toUpperCase('a'));
        System.out.println('a' + " toTittle is :" + Character.toTitleCase('a'));


    }

    /* 数学类 :弧度和角度转换，随机数，cos之类*/
    public static void showMath() {
        /*转换为角度*/
        double mAngle = Math.PI;//弧度
        System.out.println("转换为角度：" + Math.toDegrees(mAngle));

         /*cos:要转换为弧度计算*/
        double cosN = Math.toDegrees(Math.PI);
        System.out.println("cos(" + cosN + ") = " + Math.cos(Math.PI));// 弧度计算

        /*角度转化为弧度*/
        double mRadians = Math.toDegrees(Math.PI);
        System.out.println("转化为弧度：" + Math.toRadians(mRadians));

        /*随机数*/
        Random rand = new Random();
        System.out.println("----------------------随机数---------------------------");
        for (int i = 0; i < 20; i++) {
            int rNum = rand.nextInt(10);
            System.out.print(rNum + " ");
        }
        /*[a,b]之间的随机数*/
        System.out.println("\n----------------------随机数[a,b]---------------------------");
        int rA = 1, rB = 5;
        for (int i = 0; i < 20; i++) {
            int rNum = rand.nextInt(rB - rA + 1) + rA;
            System.out.print(rNum + " ");
        }
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

        /*最小值*/
        Integer[] minA = {5, 3, 66, 7, 5, 8};
        int[] minB = {5, 3, 66, 7, 5, 8};
//        int maxRes2 = (int) Collections.max(Arrays.asList(minB));//因为有泛型，泛型里面不能为<int>


        int minRes = (int) Collections.min(Arrays.asList(minA));//最小值
        int maxRes = (int) Collections.max(Arrays.asList(minA));//最大值


        System.out.println(Arrays.toString(minA));
        System.out.println("最大值：" + maxRes + "最小值：" + minRes);


//        /*map reduce里面的，先不看*/
//        int[] sptArr = {1, 2, 3, 4, 5};
//        Arrays.spliterator(sptArr);
    }


}
