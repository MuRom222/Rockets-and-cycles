package ru.netology.sqr.SQRService.services;

public class SQRService {

    public static int calcSquare(int x ) {

        int counter = 0;

        for (int i = 10; i <= x; i++ ) {
            if (i * i <= x) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}