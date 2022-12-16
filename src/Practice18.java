import java.util.ArrayList;

public class Practice18 {
    public static void main(String[] args) {
        System.out.print("랜덤한 정수들 :");
        int n;
        int sum = 0;
        for (int i = 0; i<10;i++){
            n = (int) (Math.random()*10 +1);
            System.out.printf(n+" ");
            sum+=n;
        }
        System.out.println(" ");
        System.out.println("평균은 " +(float)(sum/10));
    }
}
