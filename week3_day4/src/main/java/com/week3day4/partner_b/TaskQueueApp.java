package com.week3day4.partner_b;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Predicate;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Partner B — drain PriorityQueue in priority order. */
public class TaskQueueApp {
    private static final Logger logger =
            LoggerFactory.getLogger(TaskQueueApp.class);
    public static void main(String[] args) {
        logger.info("Starting TaskQueueApp");
        Queue<Task> q = new PriorityQueue<>();
        // : offer tasks out of order, poll and print, peek demo

        // q.offer(new Task(3, "wake up"));
        q.offer(new Task(1, "run"));
        q.offer(new Task(5, "jump"));
        q.offer(new Task(2, "crawl"));

        if (q.isEmpty()) {
        logger.warn("Task queue is empty");
        }

        System.out.println("Peek:");
        System.out.println(q.peek());
        ArrayList<Task> taskList = new ArrayList<>(q);

        Predicate<Task> importantTask = task -> task.getPriority() <= 2;

        taskList.removeIf(importantTask.negate());

        // sort by description
        Comparator<Task> descriptionOrder = Comparator.comparing(Task::getDescription);
        taskList.sort(descriptionOrder);

        System.out.println("\nImportant Tasks:");

        taskList.forEach(System.out::println);

        System.out.println("\nPoll Order: ");

        while (!q.isEmpty()) {
            logger.debug("Polling task: {}", q.peek());
            System.out.println(q.poll());
        }

    }
}