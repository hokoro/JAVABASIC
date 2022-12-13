import java.util.Objects;
import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {
        int a,b;
        String c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("연산>>");
        a = scanner.nextInt();
        c = scanner.next();
        b = scanner.nextInt();

        if (Objects.equals(c, "+")){
            System.out.println(a+c+b+"의 계산 결과는 "+(a+b));
        } else if (Objects.equals(c,"-")) {
            System.out.println(a+c+b+"의 계산 결과는 "+(a-b));
        } else if (Objects.equals(c,"*")) {
            System.out.println(a+c+b+"의 계산 결과는 "+(a*b));
        }else System.out.println(a+c+b+"의 계산 결과는 "+(a/b));

    }
}
