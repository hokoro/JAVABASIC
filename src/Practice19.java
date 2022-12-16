import java.util.ArrayList;
import java.util.Scanner;

public class Practice19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 몇개?");
        int n = scanner.nextInt();
        int a;
        ArrayList<Integer> array = new ArrayList<Integer>();
        int len = n / 10;
        for(int i = 0; i<len; i++){
                a = (int) (Math.random() * 100+1);
                if (array.contains(a)){
                    continue;
                }
                else{
                    System.out.println(a + " ");
                    array.add(a);
                }

        }
    }
}
