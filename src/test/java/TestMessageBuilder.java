package com.mkyong.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMessageBuilder {

    @Test
    public void testHelloWorld() {
        assertEquals("GG Gaming Adik-Adik", MessageBuilder.getHelloWorld());
    }

    @Test
    public void testNumber() {
        assertEquals(8, MessageBuilder.getNumber());
    }

}