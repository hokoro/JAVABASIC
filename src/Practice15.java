import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하세요>>");
        char c = scanner.next().charAt(0);

        int len = Integer.valueOf(c) - 96;
        for(int i = 0; i<len; i++){
            for(int j = 0; j<len-i; j++){
                System.out.print((char)(97+j));
            }
            System.out.println(" ");
        }

    }
}
