package ru.netology.sqr.SQRService.services;

public class SQRService {

    public static int calcSqr(int limit ) {

        int counter = 0;

        for (int i = 10; i <= 99; i++ ) {
            if (i * i <= limit) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}