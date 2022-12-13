import java.util.Scanner;

public class Operation_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");

        int time = scanner.nextInt();
        int second = time % 60;
        int minute = (time / 60) % 60;
        int hour = (time/60) / 60;

        System.out.println(second);
        System.out.println(minute);
        System.out.println(hour);

        /*증감 연산자 대입 연산자*/

        int a=3 , b=3 , c=3;

        System.out.println(a++);
        System.out.println(++a);

        System.out.println(b--);
        System.out.println(b++);

        c += a;
        System.out.println(c);
        c-= b;
        System.out.println(c);


        scanner.close();
    }
}
