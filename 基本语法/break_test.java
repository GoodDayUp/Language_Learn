package atguigu.java;

public class break_test {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            if (i==3) {
                break;
            }
            System.out.println("i= " + i);
        }
        System.out.println("game over");
    }
}
