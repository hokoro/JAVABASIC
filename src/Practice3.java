import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money;
        System.out.print("금액을 입력하시오>>");
        money = scanner.nextInt();

        System.out.println("오만원권 "+money/50000+"매");
        System.out.println("만원권 "+(money%50000)/10000+"매");
        System.out.println("천원권 "+((money%50000)%10000)/1000 +"매");
        System.out.println("백원 "+((((money%50000)%10000)%1000)/100)+"개");
        System.out.println("오십원 "+(((((money%50000)%10000)%1000)%100)/50)+"개");
        System.out.println("십원 "+((((((money%50000)%10000)%1000)%100)%50)/10)+"개");
        System.out.println("일원 "+(((((((money % 50000) % 10000) % 1000) % 100) % 50) % 10)) +"개");
    }
}
