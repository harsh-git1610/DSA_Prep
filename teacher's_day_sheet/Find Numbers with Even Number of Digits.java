class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0 ; 
         for( int i : nums){
            if((i>9 && i<100) || (i>999 && i < 10000) || i == 100000)
            ans += 1 ; 
         }return ans ; 
    }
}
