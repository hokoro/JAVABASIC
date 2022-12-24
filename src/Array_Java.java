import java.util.Arrays;

public class Array_Java {
    public static void main(String[] args) {
        /*
        타입 [] 배열명 = 값
        * */
        String[] weeks = {"월","화","수","목","금","토","일"};
        System.out.println(weeks[3]);

        // for 문으로 출력 보여주기
        for (int i = 0 ; i< weeks.length; i++){
            System.out.println(weeks[i]);
        }

        // for each
        /*
        for (타입 변수 : 배열명){
              내용
        }
        * */
        for (String week : weeks) {
            System.out.println(week);
        }

        //Wrapper class / Primitive class

        Integer [] arr = {1,2,3,4,5}; //wrapper class
        int [] arr1 = {1,2,3,4,5}; // Primitive class

        Integer [] data_list = new Integer[10]; //new 를 선언하여 데이터 의 크기를 정할수 있음
        data_list[0] = 1; // 데이터 를 넣을수도 있음


        // 자바 배열을 쉽게 출력하는 방법
        System.out.println(Arrays.toString(arr)); // Array를 toString 으로 쉽게 출력 가능



    }
}
