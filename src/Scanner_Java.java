import java.util.Scanner;

public class Scanner_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner 객체 열기
        String name = scanner.next();// next -> 문자열 리턴
        String city = scanner.next();
        int age = scanner.nextInt(); // nextInt -> 정수 입력 리턴
        double weight = scanner.nextDouble(); // nextDouble -> 실수형 입력 리턴
        boolean isSignal = scanner.nextBoolean(); // nextBoolean -> 논리값 입력 리턴

        System.out.print("이름은 " + name +  ",");
        System.out.print("도시는 " +city + ",");
        System.out.print("나이는 " +age + ",");
        System.out.print("체중은 "+weight+",");
        System.out.print("독신 여부는 "+isSignal+"입니다.");

        scanner.close(); // scanner 객체 닫기
    }
}
