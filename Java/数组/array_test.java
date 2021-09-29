package atguigu.java;

/**
 * 数组一旦初始化，其长度是不可变的
 *
 * 一维动态初始化：数组声明且为数组元素分配空间与赋值的操作分开进行
 * int[] arr = new int[3];
 * arr[0] = 1;
 * arr[1] = 2;
 * arr[2]  =3;
 *
 * String names[];
 * names = new String[3];
 * names[0] = "小明";
 * names[1] = "小刚";
 * names[2] = "小强";
 *
 *
 * 一维静态初始化：在定义数组的同时就为数组元素分配空间并赋值
 * int arr[] = new int[]{1, 2, 3};
 * int[] arr1 = {1, 2, 3};
 * String names[] = {
 *     "小明", "小刚", "小强";
 * }
 *
 * 数组的长度：arr.length
 *
 * 二维数组动态初始化
 * int[][] arr = new int[3][2];  // 二维数组中有3个一维数组，每一个一维数组中有2个元素
 * arr[0],arr[1],arr[2]
 *
 * int[][] arr1 = new int[3][];  // 二维数组中有3个一维数组，每一个一维数组都是默认初始化值null
 * arr[0] = new int[3];
 * arr[1] = new int[2];
 * arr[2] = new int[1];
 *
 * 二维数组静态初始化
 * int[][] arr = new int[][]{{3,8,2}, {2,7}, {1,2,3,4}};
 *
 * int[] x, y[];  // x是一维数组，y是二维数组
 */


public class array_test {
    public static void main(String[] args) {
//        int a[] = new int[5];
//        System.out.println(a[3]);  // a[3]默认为0，隐式初始化

//        int s[];
//        s = new int[10];
//        for (int i=0; i<s.length; i++) {
//            System.out.println(i);
//        }

//        int arr[] = new int[]{8, 2, 1, 0, 3};
//        int index[] = new int[]{2,0,3,2,4,0,1,3,2,3,3};
//        String tel = "";
//        for (int i=0; i<index.length; i++) {
//            tel += arr[index[i]];
//        }
//        System.out.println("联系方式： " + tel);




    }
}
