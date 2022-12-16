import java.util.ArrayList;
import java.util.Scanner;

public class Practice17 {
    public static void main(String[] args) {
        int [] unit = {50000,10000,1000,500,100,50,10,1};
        Scanner scanner = new Scanner(System.in);
        int money = 0;
        ArrayList<Integer> moneys  = new ArrayList<Integer>();
        System.out.print("금액을 입력하시오>>");
        money = scanner.nextInt();
        for (int un: unit) {
            moneys.add(money / un);
            money = money % un;
        }

        for(int i =0; i<unit.length; i++){
            if (moneys.get(i) != 0){
                System.out.println(unit[i] + "원 짜리 :" + moneys.get(i) + "개");
            }
        }
    }
}
