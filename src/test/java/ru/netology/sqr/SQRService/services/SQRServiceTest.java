package ru.netology.sqr.SQRService.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService.services.SQRService;

public class SQRServiceTest {


    @Test
    public void shouldUpMeaning () {
        SQRService service = new SQRService();

        int expected = 5;
        int actual = service.calcSqr(9000,10000);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldDownMeaning () {
        SQRService service = new SQRService();

        int expected = 5;
        int actual = service.calcSqr(100,200);

        Assertions.assertEquals(expected,actual);

    }


}
