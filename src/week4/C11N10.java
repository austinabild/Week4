package week4;

import java.util.Scanner;

public class C11N10 {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 strings... ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }

        System.out.println("Displaying them in reverse order.");
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }
}
