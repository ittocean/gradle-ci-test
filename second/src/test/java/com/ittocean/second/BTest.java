package com.ittocean.second;

import com.ittocean.first.A;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BTest {

    @Test
    public void test() {
        B named = new B(new A("B"));
        assertEquals("B", named.getA().getName());
    }

}