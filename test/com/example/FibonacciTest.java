package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    @Test
    public void fib() throws Exception {
        int [] solutions = {1, 1, 2, 3, 5, 8, 13, 21, 34};
        for (int i = 0; i < solutions.length; i++) {
            assertEquals(solutions[i], Fibonacci.fib(i));
        }
    }

    @Test
    public void fib200() throws Exception {
        assertEquals(0, Fibonacci.fib(200));

    }

    @Test
    public void fibIterative() throws Exception {
        int [] solutions = {1, 1, 2, 3, 5, 8, 13, 21, 34};
        for (int i = 0; i < solutions.length; i++) {
            assertEquals(solutions[i], Fibonacci.fibIterative(i));
        }
    }

    @Test
    public void fibIterative200() throws Exception {
        assertEquals(0, Fibonacci.fibIterative(200));

    }
}