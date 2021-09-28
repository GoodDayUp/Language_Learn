package atguigu.java;

// 至少执行一次循环体

public class do_while_test {
    public static void main(String[] args) {
        int res = 0;
        int i = 1;
        do {
            res += i;
            i++;
        } while (i <= 100);
        System.out.println("res: " + res);
    }
}
