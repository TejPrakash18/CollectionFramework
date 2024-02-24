package Stacks;

import java.util.Stack;

public class StackExamples {
    public static void main(String[] args) {
        Stack<Integer> stackObj = new Stack<>();

        //stack methods
        stackObj.push(2);
        stackObj.push(4);
        stackObj.push(5);
        System.out.println(stackObj);

        stackObj.pop();
        System.out.println(stackObj);
        System.out.println(stackObj.search(4));
        System.out.println(stackObj.empty());
        System.out.println(stackObj.peek());
    }
}
