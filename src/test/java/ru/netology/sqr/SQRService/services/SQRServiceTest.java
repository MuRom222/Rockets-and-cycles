package ru.netology.sqr.SQRService.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService.services.SQRService;

public class SQRServiceTest {


    @Test
    public void shouldUpMeaning () {
        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.calcSqr(300);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldDownMeaning () {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calcSqr(100);

        Assertions.assertEquals(expected,actual);

    }


}
