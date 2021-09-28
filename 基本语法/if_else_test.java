package atguigu.java;

import java.util.Scanner;

public class if_else_test {
    public static void main(String[] args) {
//        int age = 75;
//        if (age < 0) {
//            System.out.println("不可能！");
//        } else if (age > 250) {
//            System.out.println("是个妖怪");
//        } else {
//            System.out.println("人家芳龄");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数： ");
        int score = scanner.nextInt();
        if (score==100) {
            System.out.println("奖励一台BWM");
        } else if ((score > 5)  & (score <= 99)) {
            System.out.println("奖励一台iphone");
        } else {
            System.out.println("继续努力！");
        }
    }
}
