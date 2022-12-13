public class Final_Java {
    public static void main(String[] args) {
        final double PI = 3.141592; // 상수 선언시 변수 타입 앞에 final 선언
        double radius  = 10.0;
        double circleArea = radius * radius * PI;

        System.out.println("원의 면적: " + circleArea);

    }
}
