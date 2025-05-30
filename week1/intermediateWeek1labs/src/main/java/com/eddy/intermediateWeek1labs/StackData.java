package com.eddy.intermediateWeek1labs;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackData<T> {
    private ArrayList<T> stack;

    public StackData() {
        stack = new ArrayList<>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public void display() {
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }

    public static void main(String[] args) {
        StackData<Integer> intStack = new StackData<>();

        // Push items
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        System.out.println("After pushing 1, 2, 3:");
        intStack.display();

        // Pop an item
        int popped = intStack.pop();
        System.out.println("Popped: " + popped);
        System.out.println("After popping:");
        intStack.display();


    }

}
