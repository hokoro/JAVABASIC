import java.util.Scanner;

public class P1023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i;
        float f;
        String[]a = s.split("\\.");

        i = Integer.parseInt(a[0]);
        // i = Integer.valueOf(a[0]);


        f = Float.parseFloat(a[1]);
        // f = Float.valueOf(a[1]);

        System.out.println(i);
        System.out.printf("%.0f",f);
    }
}
