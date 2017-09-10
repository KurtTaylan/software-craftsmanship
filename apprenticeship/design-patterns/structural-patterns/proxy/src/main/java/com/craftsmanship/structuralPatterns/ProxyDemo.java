package com.craftsmanship.structuralPatterns;

import java.util.Scanner;

/**
 * 1. Create a "wrapper" for a remote, or expensive, or sensitive target
 * 2. Encapsulate the complexity/overhead of the target in the wrapper
 * 3. The client deals with the wrapper
 * 4. The wrapper delegates to the target
 * 5. To support plug-compatibility of wrapper and target, create an interface
 */
public class ProxyDemo {

    public static void main(String[] args) {
        // 3. The client deals with the wrapper
        SocketInterface socket = new SocketProxy("127.0.0.1", 8080, args[0].equals("first") ? true : false);
        String str;
        boolean skip = true;
        while (true) {
            if (args[0].equals("second") && skip) {
                skip = !skip;
            } else {
                str = socket.readLine();
                System.out.println("Receive - " + str);
                if (str.equals(null)) {
                    break;
                }
            }
            System.out.print("Send ---- ");
            str = new Scanner(System.in).nextLine();
            socket.writeLine(str);
            if (str.equals("quit")) {
                break;
            }
        }
        socket.dispose();
    }
}
