package ru.netology.sqr.SQRService.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService.services.SQRService;

public class SQRServiceTest {


    @Test
    public void shouldCalcInParameter () {
        SQRService service = new SQRService();

        int expected = 5;
        int actual = service.calcSquare(200);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldСalcLowerBound () {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calcSquare(100);

        Assertions.assertEquals(expected,actual);

    }




}
