import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        int n;
        int one , ten;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오>>");

        n = scanner.nextInt();

        if (n%3 == 0 && (n/3) >= 11){
            System.out.println("박수 짝짝");
        }
        else if(n%3 == 0){
            System.out.println("박수 짝");
        }
        else System.out.println("박수 없다");
    }
}
