import java.util.ArrayList;

public class EnqueueDequeue_Java<T> {
    private final ArrayList<T> queue = new ArrayList<T>();

    public void enqueue(T item){
        queue.add(item); //큐에 원소 추가
    }

    public T dequeue(){
        if(queue.isEmpty()){  // dequeue 를 할때 큐가 비어 있는지 확인해야 한다 -> 비어 있으면 원소가 없기 떄문에
            return null;
        }
        return queue.remove(0); // 그게 아니라면 첫번쨰 원소를 리턴 = Queue 는 FIFO
    }

    public boolean isEmpty(){  // 비어 있는지 확인 하는 방법 isEmpty() 함수
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        EnqueueDequeue_Java<Integer>mq = new EnqueueDequeue_Java<Integer>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);

        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
    }
}
