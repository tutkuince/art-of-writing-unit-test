package com.muditasoft.artofwritingunittest.sample03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTest {

    @Test
    void test_assertions() {
        Dummy d1 = new Dummy(5);
        Dummy d2 = new Dummy(5);
        Dummy d3 = d2;
        Dummy d4 = null;

        assertEquals(d1, d2);
        assertSame(d2, d3);
        assertNull(d4);
        assertTrue(d2 == d3);
        assertFalse(d1 == d4);
    }

    private static class Dummy {
        private int id;

        public Dummy(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        @Override
        public boolean equals(Object obj) {
            return this.id == ((Dummy) obj).getId();
        }
    }
}
