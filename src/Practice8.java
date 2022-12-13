import java.util.Scanner;

public class Practice8 {
    public static boolean inRect(int x , int y , int rectx1 , int rectx2 , int recty1 , int recty2) {
        return (x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2);
    }
    public static void main(String[] args) {
        int x,y;
        Scanner scanner = new Scanner(System.in);

        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(inRect(x,y , 100 ,200 , 100 , 200));
    }
}
