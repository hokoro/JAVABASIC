import java.util.Stack;

public class Stack_Java {
    /* Stack
    LIFO 구조 -> 가장 늦게 들어온 원소가 가장 빨리 나가는 구조
    * */
    public static void main(String[] args) {
        Stack<Integer> stack_int = new Stack<Integer>();

        //stack 삽입 방법 push
        stack_int.push(1);
        stack_int.push(2);
        stack_int.push(3);

        //stack 제거 방법 pop

        System.out.println(stack_int.pop()); //3
        System.out.println(stack_int.pop()); //2
        System.out.println(stack_int.pop()); //1
    }
}
