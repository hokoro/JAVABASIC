import java.util.ArrayList;
import java.util.Scanner;

public class Practice16 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        ArrayList nums = new ArrayList();
        System.out.print("양의 정수 10개를 입력하시오 >>");
        for(int i = 0; i<10; i++){
            n = scanner.nextInt();
            if(n%3==0){
                nums.add(n);
            }
            else continue;
        }
        for(Object num :nums){
            System.out.print(num+" ");
        }
    }
}
