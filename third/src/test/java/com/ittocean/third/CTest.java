package com.ittocean.third;

import com.ittocean.first.A;
import com.ittocean.second.B;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CTest {

    @Test
    public void test() {
        C named = new C(new B(new A("C")));
        assertEquals("C", named.getB().getA().getName());
    }
}