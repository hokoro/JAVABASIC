import java.util.Scanner;

public class P1025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int [] nums = new int[5];

        for(int i = 0; i < 5; i++){
            nums[i] = (int) ((int) ((n / Math.pow(10,4-i))) * Math.pow(10,4-i));
            n = (int) (n % Math.pow(10,4-i));
        }
        for(int i = 0; i < 5; i++){
            System.out.printf("[%d]\n",nums[i]);
        }

    }
}
