import java.util.Scanner;

public class Practice27 {
    public static void main(String[] args) {
        String str[] = {"가위","바위","보"};
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        String user;
        while(true){
            System.out.print("가위 바위 보!>>");
            user = scanner.nextLine();
            if(user.equals("그만")){
                System.out.println("게임을 종료합니다");
                break;
            }else{
                index = (int) (Math.random()*3);
                if(str[index].equals("바위")){
                    if(user.equals("바위")){
                        System.out.println("사용자 = " + user + " 컴퓨터 = " + str[index] + " 비겼습니다");
                    }
                    else if(user.equals("가위")){
                        System.out.println("사용자 = " + user + " 컴퓨터 = " + str[index] + " 졌습니다");
                    }
                    else{
                        System.out.println("사용자 = " + user + " 컴퓨터 = " + str[index] + " 이겼습니다");
                    }
                } else if (str[index].equals("가위")) {
                    if(user.equals("바위")){
                        System.out.println("사용자 = " + user + " 컴퓨터 = " + str[index] + " 이겼습니다");
                    }
                    else if(user.equals("가위")){
                        System.out.println("사용자 = " + user + " 컴퓨터 = " + str[index] + " 비겼습니다");
                    }
                    else{
                        System.out.println("사용자 = " + user + " 컴퓨터 = " + str[index] + " 졌습니다");
                    }
                }else{
                    if(user.equals("바위")){
                        System.out.println("사용자 = " + user + " 컴퓨터 = " + str[index] + " 졌습니다");
                    }
                    else if(user.equals("가위")){
                        System.out.println("사용자 = " + user + " 컴퓨터 = " + str[index] + " 이겼습니다");
                    }
                    else{
                        System.out.println("사용자 = " + user + " 컴퓨터 = " + str[index] + " 비겼습니다");
                    }
                }
            }
        }
    }
}
