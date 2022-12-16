import java.util.ArrayList;

public class Practice21 {
    public static void main(String[] args) {
        int [][] nums = new int[4][4];
        ArrayList<Integer> xs = new ArrayList<Integer>();
        ArrayList<Integer> ys = new ArrayList<Integer>();
        int x,y,n;
        for (int i = 0; i<10;i++) {
            x = (int) (Math.random() * 3 + 1);
            y = (int) (Math.random() * 3 + 1);
            n = (int) (Math.random() * 10 + 1);
            if (!xs.contains(x) || !ys.contains(y)) {
                nums[x][y] = n;
                xs.add(x);
                ys.add(y);
            } else {
                continue;
            }
        }
        for(int k=0; k<4;k++){
            for(int j=0;j<4;j++){
                System.out.print(nums[k][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
