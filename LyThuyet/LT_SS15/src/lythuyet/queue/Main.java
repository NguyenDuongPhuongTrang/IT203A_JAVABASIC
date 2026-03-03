package lythuyet.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // HÀNG ĐỢI 1 ĐẦU
        Queue<String> queue = new ArrayDeque<>();
        queue.add("apple"); //thêm
        queue.offer("banana"); //thêm
        queue.remove(); //lấy và xóa ptu đầu -> sinh ra ngoại lệ và dừng chương trình
        queue.poll(); //lấy và xóa -> k lấy ra ngoại lệ và trả về null
        queue.peek(); // lấy nhưng k xóa ptu đầu
        queue.element();// lấy nhwung k xóa

        // HÀNG ĐỢI 2 ĐẦU
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("apple");
        linkedList.getFirst();
        linkedList.addLast("banana");
        linkedList.getLast();
    }
}
