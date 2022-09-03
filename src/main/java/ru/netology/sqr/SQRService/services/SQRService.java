package ru.netology.sqr.SQRService.services;

public class SQRService {

    public static int calcSqr(int limitMin,int limitMax) {

        int counter = 0;


        for (int i = 10; i <= 99; i++ ) {
            if ( (limitMin <= i * i) && (i * i <= limitMax)) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}