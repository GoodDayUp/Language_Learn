package atguigu.java;

public class swith_case_test {
    public static void main(String[] args) {
//        int i = 1;
//        switch (i) {
//            case 0:
//                System.out.println("zero");
//                break;
//            case 1:
//                System.out.println("one");
//                break;
//            default:
//                System.out.println("default");
//                break;
//        }


        String season = "summer";
        switch (season) {
            case "spring":
                System.out.println("春暖花开");
                break;
            case "summer":
                System.out.println("夏日炎炎");
                break;
            case "autumn":
                System.out.println("秋高气爽");
                break;
            case "winter":
                System.out.println("冬雪皑皑");
                break;
            default:
                System.out.println("季节输入有误");
                break;
        }
    }
}
