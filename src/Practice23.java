import java.lang.reflect.Type;
import java.util.Scanner;

public class Practice23 {
    public static boolean isNumberic(String input) {
        try {
            Double.parseDouble(input);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            String command_line = scanner.nextLine();

            String [] command_token = command_line.split(" ");

            String command = command_token[0] + " " + command_token[1];

            if (command.equals("java Add")){
                for(int i = 2; i<command_token.length; i++){
                    if(command_token[i].contains(".") && isNumberic(command_token[i])){
                        continue;
                    } else if (command_token[i].contains(".") || isNumberic(command_token[i])) {
                        sum += Integer.valueOf(command_token[i]);
                    }else{
                        continue;
                    }
                }
            }
            else {
                break;
            }
            System.out.println(sum) ;
        }

    }
}
