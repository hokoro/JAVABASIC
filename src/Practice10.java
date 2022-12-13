import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        int rx1 , ry1 , r1;
        int rx2 , ry2 , r2;
        double d;
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번쨰 원의 중심과 반지름>>");
        rx1 = scanner.nextInt();
        ry1 = scanner.nextInt();
        r1 = scanner.nextInt();

        System.out.print("두번쨰 원의 중심과 반지름>>");
        rx2 = scanner.nextInt();
        ry2 = scanner.nextInt();
        r2= scanner.nextInt();

        d = Math.sqrt(Math.pow(rx2-rx1,2) + Math.pow(ry2-ry1,2));
        if (r2-r1 < d && d < r2 + r1){
            System.out.println("원이 겹칩니다");
        }else System.out.println("원이 겹치지 않습니다");

    }
}
