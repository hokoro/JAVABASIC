import java.util.Scanner;

public class Practice25 {
    public static void main(String[] args) {
        String course[] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
        int score[] = {95,88,76,62,55};
        boolean check = false;
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("과목 이름>>");
            String subject = scanner.nextLine();
            if (subject.equals("그만")){
                break;
            }
            else {
                for (int i = 0; i<course.length; i++){
                    if(course[i].equals(subject)){
                        index = i;
                        check = true;
                        break;
                        //System.out.println(course[i]+"의 점수는 "+score[i]);
                    } else {
                        check = false;
                       //System.out.println("없는 과목입니다.");
                    }
                }

                if(check){
                    System.out.println(course[index]+"의 점수는 "+score[index]);
                }
                else{
                    System.out.println("없는 과목입니다.");
                }
            }

        }
    }
}
