package com.epam.rd.autotasks.meetastranger;

import java.io.IOException;
import java.util.Scanner;

public class MeetAStranger {
    public static void main(String[] args) {
        //Write a program, which read a String from System.in and print "Hello, <input string>"
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        while(scanner.hasNext()){
            str.append(scanner.next());
            str.append(' ');
        }
        System.out.printf("Hello, %s", str);
    }
}
