package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    public void lowerBoundZero() {
        Solution solution = new Solution();
        assertEquals(2, solution.solution(0, 3, 3));
    }

    @Test
    public void boundsEqual() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution(10, 10, 5));
    }

    @Test
    public void boundsEqual_Result_0() {
        Solution solution = new Solution();
        assertEquals(0, solution.solution(11, 11, 5));
    }

    @Test
    public void boundsDivisible() {
        Solution solution = new Solution();
        assertEquals(5, solution.solution(12, 24, 3));
    }

    @Test
    public void lowerBoundDivisible() {
        Solution solution = new Solution();
        assertEquals(4, solution.solution(12, 23, 3));
    }

    @Test
    public void upperBoundDivisible() {
        Solution solution = new Solution();
        assertEquals(4, solution.solution(13, 24, 3));
    }

    @Test
    public void simple() {
        Solution solution = new Solution();
        assertEquals(20, solution.solution(11, 345, 17));
    }

    @Test
    public void minimal() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution(0, 0, 11));
    }

    @Test
    public void minimal2() {
        Solution solution = new Solution();
        assertEquals(0, solution.solution(1, 1, 11));
    }
}