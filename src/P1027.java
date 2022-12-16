import java.util.Scanner;

public class P1027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String YMD = scanner.nextLine();
        int year,month,day;
        String []YMD_token = YMD.split("\\.");
        year = Integer.valueOf(YMD_token[0]);
        month = Integer.valueOf(YMD_token[1]);
        day = Integer.valueOf(YMD_token[2]);

        System.out.printf("%02d-%02d-%04d",day,month,year);
    }
}
