import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 3개 입력>>");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if((a>b) && (b>c) || (c>b) && (b>a)){
            System.out.println("중간 값은 "+b);
        }
        else if ((b>a)&&(a>c) || (c>a) && (a>b)) {
            System.out.println("중간 값은 "+a);
        }else System.out.println("중간 값은 "+c);
    }
}
