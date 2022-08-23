package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int secondsInTime = seconds % 60;
        int minutes = (seconds - secondsInTime) / 60;
        int minutesInTime = minutes % 60;
        int hours = (minutes - minutesInTime) / 60;
        int hoursInTime = hours % 24;
        String string = "";
        string += hoursInTime + ":";
        if (minutesInTime < 10) {
            string += "0" + minutesInTime + ":";
        } else {
            string += minutesInTime + ":";
        }
        if(secondsInTime < 10){
            string += "0" + secondsInTime;
        } else{
            string += secondsInTime;
        }
        System.out.println(string);
    }
}
