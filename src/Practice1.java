import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money;
        System.out.print("원화를 입력하세요>>");
        money = scanner.nextInt();
        System.out.println(money+"원은 $"+(double)(money/1100)+"입니다.");
    }
}
