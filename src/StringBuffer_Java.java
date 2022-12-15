public class StringBuffer_Java {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); // StringBuffer 객체 생성
        sb.append("Hello");
        sb.append(" ");
        sb.append("Jump to Java");

        String result = sb.toString(); // String Buffer 를 String 객체로 변환
        System.out.println(result);

        String sb1 = "";
        sb1 += "Hello";
        sb1 += " ";
        sb1 += "Jump to Java";

        System.out.println(sb1);    // String 객체로 작성 가능하다

        // insert
        sb.insert(0," Hello Jump to python"); // 지정된 버퍼 위치에 문자열 삽입
        System.out.println(sb.toString());

        // subString
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Hello Jump to Java");
        System.out.println(sb2.substring(0,4)); // start 부터 end 지점 까지 출력
    }
}
