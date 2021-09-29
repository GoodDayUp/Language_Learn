package atguigu.java;

import java.util.Arrays;

/**
 * java.util.Arrays类是操作数组的工具类，包含了用来操作数组（比如排序和搜索）的各种方法
 * boolean equals(int[] a, int[] b);  // 判断两个数组是否相等
 * String toString(int[] a);  // 输出数组信息
 * void fill(int[] a, int val);  // 将指定值填充到数组中
 * void sort(int[] a);  // 对数组进行排序
 * int binarySearch(int[] a, int key);  // 对排序后的数组进行二分法检索指定的值
 */

public class array_class_test {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 7, 8, 4, 3};
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
