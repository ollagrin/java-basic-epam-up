package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int piecesInOne = scanner.nextInt();
        int allPieces = piecesInOne;
        int number = 1;
        while (allPieces % people != 0) {
            ++number;
            allPieces += piecesInOne;
        }
        System.out.println(number);
    }
}
