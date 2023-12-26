package com.automation.bootcamp_submission;

import java.util.Stack;

public class QueueUsingTwoStacks {
    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeueStack;

    public QueueUsingTwoStacks() {
        this.enqueueStack = new Stack<>();
        this.dequeueStack = new Stack<>();
    }

    // Method to enqueue (push) an element into the queue
    public void enqueue(int element) {
        enqueueStack.push(element);
    }

    // Method to dequeue (pop) an element from the front of the queue
    public int dequeue() {
        if (dequeueStack.isEmpty()) {
            // If dequeue stack is empty, transfer elements from enqueue stack
            transferElements();
        }

        if (dequeueStack.isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot dequeue.");
        }

        return dequeueStack.pop();
    }

    // Method to transfer elements from enqueue stack to dequeue stack
    private void transferElements() {
        while (!enqueueStack.isEmpty()) {
            dequeueStack.push(enqueueStack.pop());
        }
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Dequeue elements
        System.out.println("Dequeued element: " + queue.dequeue());

        // Enqueue more elements
        queue.enqueue(40);
        queue.enqueue(50);

        // Dequeue elements
        while (!queue.isEmpty()) {
            System.out.println("Dequeued element: " + queue.dequeue());
        }
    }
}

