public class SingleLinkedList<T> {
    public Node<T> head = null;
    public class Node<T>{
        T data;
        Node<T> next = null;
        public Node(T data){
            this.data = data;
        }
    }

    public void addNode(T data){
        if(head == null){ // head 가 없으면 head 노드를 설정해야 한다.
            head = new Node<T>(data);
        }else{
            Node<T>node = this.head;
            while (node.next !=null){
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }
    public void printAll(){
        if(head != null){
            Node<T> node = this.head; // 현재 링크드리스트의 head 를 가르킴
            System.out.println(node.data);
            while (node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public Node<T> search(T data){
        if(this.head == null) { //head 가 null 일 경우
            return null; //데이터가 없는 경우 는 검색할 필요가 없음
        } else{
            Node<T> node = this.head; // head 부터 시작해서 순회해야 하기 때문에 첫 위치를 head 로 맞춘다
            while (node != null){
                if(node.data == data){ // data search 에 성공하는 경우
                    return node;
                }else{
                    node = node.next;
                }
            }
            return null; // 끝까지 다 돌았을 경우 데이터를 null 로 리턴 한다.
        }
    }

    public void addNodeInside(T data , T isData){
        Node<T> searchNode = this.search(isData); //노드를 삽입해야할 검색 위치를 찾기

        if(searchNode == null){
            this.addNode(data); // 검색 할 노드가 없으면 노드의 첫 시작이라 바로 노드를 추가하면 된다.
        }else{
            Node<T> nextNode = searchNode.next;
            searchNode.next = new Node<T>(data); // 원래 있었던 노드는 새로운 노드를 만들어 가리킨다
            searchNode.next.next = nextNode; // 새로운 노드로 연결하기 위해서 기존에 연결되어 있는 노드를 새로운 노드에 연결
        }


    }
    public boolean delNode(T isData){ //isData 는 삭제할 데이터
        if(this.head == null){ // 값이 존재 하지 않는 경우
            return false;
        }else{
            Node<T> node = this.head; // 해당 노드의 head  를 가리키고
            if(node.data == isData){ // 데이터 가 리스트 안에 있으면
                this.head = this.head.next; //head 의 위치를 변경
                return true;
            }else{
                while(node.next != null){
                    if(node.next.data == isData){ // 노드의 다음 데이터를 계속 탐색
                        node.next = node.next.next; //노드의 next를 삭제할 노드의 다음으로 가리킨다.
                        return true;
                    }
                    node = node.next; // 검색이 안되면 다음 노드를 계속 탐색
                }
                return false;
            }
        }

    }


    public static void main(String[] args) {
        SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<Integer>();
        MyLinkedList.addNode(5);
        MyLinkedList.addNode(6);

        //        System.out.println(MyLinkedList.head);
        //        System.out.println(MyLinkedList.head.data);
        //        System.out.println(MyLinkedList.head.next);
        //        System.out.println(MyLinkedList.head.next.data);

        MyLinkedList.printAll();
    }
}
