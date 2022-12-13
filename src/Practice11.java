import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.print("달을 입력하세요(1~12)>>");
        month = scanner.nextInt();

//        if(month%12<3){
//            System.out.println("겨울");
//        } else if (month%12<6) {
//            System.out.println("봄");
//        } else if (month%12<9) {
//            System.out.println("여름");
//        }else System.out.println("가을");

        switch (month % 12) {
            case 12, 1, 2 -> System.out.println("겨울");
            case 3 , 4 , 5 -> System.out.println("봄");
            case 6,7,8-> System.out.println("여름");
            case 9,10,11 -> System.out.println("가을");
        }
    }
}
