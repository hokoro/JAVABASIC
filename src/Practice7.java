import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        int x ,y;
        Scanner scanner = new Scanner(System.in);

        System.out.print("점(x,y)의 좌표를 입력하시오>>");
        x = scanner.nextInt();
        y = scanner.nextInt();

        if(x>100 && x<200 && y>100 && y<200){
            System.out.println("(" + x + "," + y + ")" + "는 사각형 안에 있습니다.");
        }
    }
}