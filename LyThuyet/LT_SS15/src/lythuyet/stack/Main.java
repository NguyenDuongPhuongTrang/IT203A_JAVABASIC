package lythuyet.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // cách dùng stack
        Stack<Integer> stack = new Stack<>(); //lớp
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4); //ptu trên cùng
        // lấy và xóa ptu trên cùng
        System.out.println("Phần tử trên cùng là: " + stack.pop());
        System.out.println(stack);
        // lấy nhưng k xóa
        System.out.println("Lấy nhưng k xóa: " + stack.peek());
        System.out.println(stack);
        // duyệt stack: duyệt từ trên xuống
        while (!stack.isEmpty()){
            // lấy và xử lý phần tử trên cùng
            Integer top = stack.pop();
            // xử lý top
            System.out.println("Top: " + top);
        }
    }
}