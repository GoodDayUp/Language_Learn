package atguigu.java;

/**
 * 二分查找算法：要求数组必须有序
 */

public class binary_search_test {
    public static void main(String[] args) {
        int[] arr = new int[]{-99, -54, -2, 0, 2, 33, 43, 256, 999};
        boolean isFlag = true;
        int number = 256;
        int head = 0;
        int end = arr.length - 1;

        while (head <= end) {
            int middle = (head + end) / 2;
            if (arr[middle] == number) {
                System.out.println("找到指定的元素，索引为： " + middle);
                isFlag = false;
                break;
            } else if (arr[middle] > number) {
                end = middle -1;
            } else {
                head = middle + 1;
            }
        }

        if (isFlag) {
            System.out.println("未找到指定的元素：" + number);
        }
    }
}
