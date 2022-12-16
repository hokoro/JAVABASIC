public class Practice24 {
    public static void main(String[] args) {
        String num;
        String [] strarray;
        int count = 0;
        for (int i = 1; i<100; i++){
            num  = String.valueOf(i);
            strarray =num.split("");
            for(String c : strarray){
                if (c.equals("3") ||c.equals("6")||c.equals("9")){
                    count += 1;
                }
            }
            if(count == 2){
                System.out.println(i + " 박수 짝짝");
            } else if (count ==1) {
                System.out.println(i + " 박수 짝");
            }else{
                continue;
            }
            count = 0;

        }
    }
}
