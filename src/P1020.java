import java.util.Scanner;

public class P1020 {
    public static void main(String[] args) {
        String pe;
        Scanner scanner = new Scanner(System.in);
        pe = scanner.next();
        String []num;
        num = pe.split("-");
        String s = "";

        s += num[0];
        s += num[1];

        System.out.println(s);

;    }
}
