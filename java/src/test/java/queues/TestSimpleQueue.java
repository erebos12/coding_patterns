package queues;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TestSimpleQueue {

    @Test
    void simpleQueueTests() {
        Queue<String> pQueue = new PriorityQueue<>();  // FIFO

        // Adding items to the pQueue using add()
        pQueue.add("Person01");
        pQueue.add("Person02");
        pQueue.add("Person03");

        // Printing the top element of the PriorityQueue without removing it from queue
        System.out.println("Peek: " + pQueue.peek());

        // Printing the top element and removing it from the PriorityQueue container
        System.out.println("Poll: " + pQueue.poll());

        // Printing the top element again
        System.out.println("Remaining: " + pQueue);
    }

    @Test
    void roundRobinViaQueue() {
        Queue<String> queue = new ConcurrentLinkedQueue<>();// FIFO
        queue.add("127.0.0.1");
        queue.add("127.0.0.2");
        queue.add("127.0.0.3");
        for (int i = 0; i < 30; i++) {
            System.out.println(serverByRoundRobin(queue));
        }
    }

    private String serverByRoundRobin(Queue<String> queue) {
        var top = queue.poll(); // remove next from queue
        queue.add(top); // enqueue it again to the queue
        return top;
    }
}
