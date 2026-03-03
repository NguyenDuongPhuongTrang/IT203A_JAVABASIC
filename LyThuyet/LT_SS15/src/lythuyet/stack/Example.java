package lythuyet.stack;

import java.util.Stack;

public class Example {
    public static void main(String[] args) {
        //đảo ngược câu trong tiếng việt
        // hello các bạn -> bạn các hello: sử dụng stack
        String ex = "Hello các bạn";
        System.out.println(ex);
        String [] arr = ex.split(" ");
        Stack<String> stringStack = new Stack<>();
        // dueyejt và thêm vào stack
        for (String word : arr){
            stringStack.add(word);
        }
        while(!stringStack.isEmpty()){
            String top = stringStack.pop();
            System.out.print(top + " ");
        }
    }
}
