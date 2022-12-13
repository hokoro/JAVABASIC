import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 3개를 입력하시오>>");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if(a>(b+c)||b>(a+c)||c>(a+b)){
            System.out.println("삼각형이 안됩니다");
        }
        else System.out.println("삼각형이 됩니다");
    }
}
