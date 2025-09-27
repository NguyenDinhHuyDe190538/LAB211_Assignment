/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211_bai4_stack_w3;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author dinhh
 */
public class Stack_Assigment {

    private List<Integer> stackValues = new ArrayList<>();

    public void push(int value) {
        stackValues.add(value);
        System.out.println(">> Pushed: " + value);
    }

    public Integer pop() {
        if (stackValues.isEmpty()) {
            System.out.println(">> Stack is empty, cannot pop.");
            return null;
        }
        int value = stackValues.remove(stackValues.size() - 1);
        System.out.println(">> Popped: " + value);
        return value;
    }

    public Integer get() {
        if (stackValues.isEmpty()) {
            System.out.println(">> Stack is empty.");
            return null;
        }
        return stackValues.get(stackValues.size() - 1);
    }

    public void display() {
        System.out.println("Current stack: " + stackValues);
    }
}
