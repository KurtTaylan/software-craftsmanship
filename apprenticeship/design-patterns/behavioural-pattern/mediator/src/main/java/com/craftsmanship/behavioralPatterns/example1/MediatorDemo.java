package com.craftsmanship.behavioralPatterns.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. Create an "intermediary" that decouples "senders" from "receivers"
 * 2. Producers are coupled only to the Mediator
 * 3. Consumers are coupled only to the Mediator
 * 4. The Mediator arbitrates the storing and retrieving of messages
 */
public class MediatorDemo {

    public static void main(String[] args) {
        List<Thread> producerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press ENTER for exit");
        Mediator mb = new Mediator();
        producerList.add(new Thread(new Producer(mb)));
        producerList.add(new Thread(new Producer(mb)));
        producerList.add(new Thread(new Consumer(mb)));
        producerList.add(new Thread(new Consumer(mb)));
        producerList.add(new Thread(new Consumer(mb)));
        producerList.add(new Thread(new Consumer(mb)));
        for (Thread p : producerList) {
            p.start();
        }
        boolean stop = false;
        String exit = scanner.nextLine();
        while (!stop) {
            if (exit.equals("")) {
                stop = true;
                for (Thread p : producerList) {
                    //noinspection deprecation
                    p.stop();
                }
            }
        }
    }
}