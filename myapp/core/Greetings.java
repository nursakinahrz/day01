package myapp.core;

import java.io.Console;

public class Greetings {

    public static void main(String[] args) {
        // Get the console
        Console cons = System.console();

        // Read from input
        String name = cons.readLine("What is your name?");

        System.out.printf("[%d] Hello %s. Nice to meet you.\n", 10, name.toUpperCase());






    }
}