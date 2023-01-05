public class Node <T>{
    /*
    떨어진 곳에 존재하는 데이터를 화살표로 연결하는 구조

    Node : 데이터의 저장 단위(포인터 , 데이터값) 으로 구성
    Pointer : 각 노드 안에서 다음이나 이전의 노드와의 연결 정보를 가지고 있는 공간

    */

    T data;
    Node<T> next = null; //노드의 처음 생성은 뒤에 원소에 연결되어 있지 않는다.

    public Node(T data){ // 생성자
        this.data = data; // 노드 = data + next(pointer)
    }

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);

        node1.next = node2; // node1 의 next 포인터를 node2로 연결
        Node<Integer>head = node1; //Node 의 첫번쨰 즉 header 를 가리키는 노드를 지정해야 한다.
    }
}
