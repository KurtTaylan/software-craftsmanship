package com.craftsmanship.behavioralPatterns.example1;

import java.util.Scanner;

/**
 * 1. Model the "independent" functionality with a "subject" abstraction
 * 2. Model the "dependent" functionality with "observer" hierarchy
 * 3. The Subject is coupled only to the Observer base class
 * 4. Observers register themselves with the Subject
 * 5. The Subject broadcasts events to all registered Observers
 * Observers "pull" the information they need from the Subject
 * Client configures the number and type of Observers
 */
public class ObserverDemo {

    public static void main(String[] args) {
        Subject sub = new Subject();
        // Client configures the number and type of Observers
        new HexObserver(sub);
        new OctObserver(sub);
        new BinObserver(sub);
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("\nEnter a number: ");
            sub.setState(scan.nextInt());
        }
    }
}
