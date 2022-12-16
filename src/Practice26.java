import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,m;
        while (true){
            try {
                System.out.print("곱하고자 하는 두수 입력>>");
                n = scanner.nextInt();
                m = scanner.nextInt();
                break;

            }catch (InputMismatchException e){
                System.out.println("실수릅 입력하면 안됩니다.");
                scanner.nextLine();
                continue;
            }
        }

        System.out.print(n + "x"+ m+"=" + n*m);

        scanner.close();
    }
}
