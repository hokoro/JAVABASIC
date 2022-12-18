import java.util.Scanner;

public class P1109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        char code = scanner.next().charAt(0);
        double key = scanner.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(code);
        System.out.println(key);
    }
}
