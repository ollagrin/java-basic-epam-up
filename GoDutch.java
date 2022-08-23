package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner scanner = new Scanner(System.in);
        int cost = scanner.nextInt();
        int numberOfPeople = scanner.nextInt();
        if(cost >= 0 && numberOfPeople > 0){
            cost *= 1.1;
            System.out.println(cost / numberOfPeople);
        } else if(cost < 0 ){
            System.out.println("Bill total amount cannot be negative");
        } else{
            System.out.println("Number of friends cannot be negative or zero");
        }
    }
}
