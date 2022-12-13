import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        int n;
        int one , ten;
        Scanner scanner = new Scanner(System.in);
        System.out.print("2자리수 정수 입력(10~99)>>");
        n = scanner.nextInt();
        one = n % 10;
        ten = n / 10;
        if (one == ten){
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다 ");
        }


    }
}
