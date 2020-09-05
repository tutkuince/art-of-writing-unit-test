package com.muditasoft.artofwritingunittest.sample03;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TestLifecycleTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before Class");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After Class");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before Method");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Method");
    }

    @Test
    void test_hello() {
        System.out.println("Test Hello");
    }
}