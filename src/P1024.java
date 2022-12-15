import java.util.Scanner;

public class P1024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        for (int i = 0; i<s.length(); i++){
            System.out.printf("'%c'\n",s.charAt(i)); // 문자열 한글자 씩 출력시 s.charAt(index);
        }

    }
}
