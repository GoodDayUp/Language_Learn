package atguigu.java;

public class while_test {
    public static void main(String[] args) {
        int res = 0;
        int i = 1;
        while (i <= 100) {
            res += i;
            i++;
        }
        System.out.println("res: " + res);
    }
}
