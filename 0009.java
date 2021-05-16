class Solution {
  
  //This question is very similiar to Q7 in leetcode, still we will first do the reverse and then compare
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        else{
            int ret = 0;
            int original = x;
            while(x != 0) {
                ret = ret * 10 + x%10;
                x /= 10;
            }
        
            return original == ret;
        }
    }
}
