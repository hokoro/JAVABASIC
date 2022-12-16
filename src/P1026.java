import java.util.Scanner;

public class P1026 {
    public static void main(String[] args) {
        int h,m,s;
        String clock;
        String[]clock_token = new String[3];
        Scanner scanner = new Scanner(System.in);
        clock = scanner.nextLine();

        clock_token = clock.split(":");

        h = Integer.valueOf(clock_token[0]);
        m = Integer.valueOf(clock_token[1]);
        s = Integer.valueOf(clock_token[2]);

        System.out.println(m);
    }
}
