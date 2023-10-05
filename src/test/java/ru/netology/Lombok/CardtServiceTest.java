package ru.netology.Lombok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.netology.Lombok.CardtService.service;

class CardtServiceTest {

    @Test
    void changeCount() {
        service = new CardtService();

        assertThrows(UnsupportedOperationException.class, () -> service.changeCount(1, 1));
    }
}