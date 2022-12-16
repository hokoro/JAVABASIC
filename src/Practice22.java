import java.util.Scanner;

public class Practice22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String command_line = scanner.nextLine();

            String [] command_token = command_line.split(" ");

            String command = command_token[0] + " " + command_token[1];
            if (command.equals("java Average")){
                int sum = 0;
                for (int i=2; i<command_token.length; i++){
                    sum += Integer.valueOf(command_token[i]);
                }
                System.out.println(sum/(command_token.length-2));
            }
            else{
                break;
            }
          }
        }

}
