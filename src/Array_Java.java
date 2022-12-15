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
    }
}
