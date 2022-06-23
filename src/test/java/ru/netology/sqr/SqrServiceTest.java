package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrServiceTest {

    @Test
    public void shoulCalc() {
        SqrService service = new SqrService();

        int actual = service.calculate(196, 580);
        int expected = 11;

        Assertions.assertEquals(expected, actual);
    }
}
