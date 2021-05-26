// Notice that we can say all numbers as A = 2 * B + A %2;
// Then, for example, if B = 1, its binary form is 01
// Then you can see A = 2, its binary form is 10, having the same amount of 1
// ALso, if A = 10, B = 5, A is 1010, B is 101, you can see moving B leftward and add a 0.
// Also, if A = 11, then you just need to make the last 0 to be 1. As a result, we get the formula


class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        result[0] = 0;
        for(int i = 1; i < n+1; i++)
            result[i] = result[i/2] + i%2;
        return result;
    }
}
