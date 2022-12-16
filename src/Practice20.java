public class Practice20 {
    public static void main(String[] args) {
        int [][] nums = new int[4][4];
        int n = 0;
        for(int i = 0; i < 4; i++){
            for(int j =0; j<4; j++){
                n = (int)(Math.random()*10+1);
                nums[i][j] = n;
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j =0; j<4; j++){
                System.out.printf("%d ",nums[i][j]);
            }
            System.out.println(" ");
        }
    }
}
