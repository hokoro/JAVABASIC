import java.util.Scanner;

public class Practice14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("정수를 입력하세요>>");
        n = scanner.nextInt();

        for(int i = 0; i<n;i++){
            for (int j = 0; j<n-i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
