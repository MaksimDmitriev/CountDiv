package com.app;

public class Solution {

    /*
    Assume that:

    A and B are integers within the range [0..2,000,000,000];
    K is an integer within the range [1..2,000,000,000];
    A ≤ B.


    Complexity:

    expected worst-case time complexity is O(1);
    expected worst-case space complexity is O(1).
     */

    public int solution(int A, int B, int K) {
        return (B / K) - (A / K) + (A % K == 0 ? 1 : 0);
        // Thank you, https://github.com/karimhamdanali/codility/blob/master/src/codility/CountDiv.java
    }
}
