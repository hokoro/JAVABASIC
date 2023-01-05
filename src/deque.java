import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 3; i>0;i--){
            deque.addFirst(i);
            deque.add(i); //addLast 함수와 똑같은 기능
        }

        for(int i = 0; i<6;i++){
            System.out.println(deque.removeFirst());
            //System.out.println(deque.removeLast()); 반대로 출력해도 똑같다
        }

    }
}
