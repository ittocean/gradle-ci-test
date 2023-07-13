package com.ittocean.first;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATest {

    @Test
    public void test() {
        A named = new A("A");
        assertEquals("A", named.getName());
    }

}