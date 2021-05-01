class Solution{
  
  //To reverse the order, we need to think of how to reverse, the method here is to find the last number of x each time by doing the mod
  //And then make it to be in the ret.
    public int reverse(int x) {
        long ret = 0;
        while(x != 0) {
            ret = ret * 10 + x%10;
            x /= 10;
        }
        if(ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)ret;
    }
}
