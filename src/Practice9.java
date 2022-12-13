import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        int mx ,my;
        double r;
        int x,y;

        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 중심과 반지름>>");
        mx = scanner.nextInt();
        my = scanner.nextInt();
        r = scanner.nextDouble();

        System.out.print("점 입력>>");
        x = scanner.nextInt();
        y = scanner.nextInt();

        if (Math.pow(r,2) > Math.pow(mx-x,2) + Math.pow(my-y,2)){
            System.out.println("점 (" + x + "," +y +")는 원 안에 있다.");
        }
    }
}
