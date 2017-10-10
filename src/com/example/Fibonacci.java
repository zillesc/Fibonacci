package com.example;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private static Map<Integer, Integer> lookupTable = new HashMap<>();

    public static int fib(int n) {

        // check the base case
        if (n <= 1) {
            return 1;
        }

        // check if we've already solved this sub-problem
        if (lookupTable.containsKey(n)) {
            return lookupTable.get(n);
        }

        // recursively solve
        int solution = fib(n - 1) + fib(n - 2);

        // memoize the result in the look-up table
        lookupTable.put(n, solution);

        return solution;
    }


    public static int fibIterative(int n) {

        // check the base case
        if (n <= 1) {
            return 1;
        }

        // initialize a memoization table
        int [] solutions = new int[n+1];
        solutions[0] = 1;
        solutions[1] = 1;

        // solve all of the sub-problems in a forward fashion (iteratively)
        for (int i = 2; i < n+1; i++) {
            solutions[i] = solutions[i-1] + solutions[i-2];
        }

        return solutions[n];
    }
}
