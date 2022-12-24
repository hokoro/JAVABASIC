import java.util.LinkedList;
import java.util.Queue;

public class Queue_Java  {
    /*
    큐(Queue) 의 구조
    FIFO -> 첫번쨰로 들어오는 원소는 첫번쨰로 사라진다.
    * */
    public static void main(String[] args) {
        Queue<Integer> queue_int = new LinkedList<Integer>(); // Queue 를 사용하기 위해서는 LinkedList 를 사용해야 한다.
        Queue<String> queue_str = new LinkedList<String>();


        //데이터 추가 add , offer
        queue_int.add(1); //원소 추가  == Enqueue
        System.out.println(queue_int.offer(2)); // Queue 에 원소를 정상적으로 집어 넣었다면 True 를 리턴
        System.out.println(queue_int);

        //큐의 첫번째 값을 반환 poll , remove
        System.out.println(queue_int.poll()); // 큐의 첫번째 값을 반환 하고 해당 값은 큐에서 삭제
        System.out.println(queue_int); // 삭제되고 남은 원소만 남는다

        System.out.println(queue_int.remove()); // poll 과 똑같은 역할
        System.out.println(queue_int);
    }
}
