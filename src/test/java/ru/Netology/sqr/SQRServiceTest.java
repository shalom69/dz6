package ru.Netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {


    @Test
    void countSquares() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.countSquares(9800, 9801);
        assertEquals(expected, actual);
    }

    @Test
    void countSquaresOverLimit() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.countSquares(9802, 9900);
        assertEquals(expected, actual);
    }

    @Test
    void countSquaresUnderLimit() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.countSquares(90, 99);
        assertEquals(expected, actual);
    }


}