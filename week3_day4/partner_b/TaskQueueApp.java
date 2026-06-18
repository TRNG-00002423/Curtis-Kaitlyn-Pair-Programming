package week3_day4.partner_b;

import java.util.PriorityQueue;
import java.util.Queue;

/** Partner B — drain PriorityQueue in priority order. */
public class TaskQueueApp {
    public static void main(String[] args) {
        Queue<Task> q = new PriorityQueue<>();
        // TODO: offer tasks out of order, poll and print, peek demo
        
        //q.offer(new Task(3, "wake up"));
        q.offer(new Task(1, "run"));
        q.offer(new Task(5, "jump"));
        q.offer(new Task(2, "crawl"));

        System.out.println("Peek:");
        System.out.println(q.peek());

        System.out.println("\n Poll order:");

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}