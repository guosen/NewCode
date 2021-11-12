public class Solution_Nc19 {
    /**
     *
     * @param array
     * @return
     */
    public int FindGreatestSumOfSubArray(int[] array) {
        int sz = array.length;
        int[]dp = new int[sz+1];
        dp[0] = 0;
        int ret = array[0];
        for(int i = 1;i<=sz ; ++i){
            dp[i] = Math.max(array[i-1],dp[i-1]+array[i-1]);
            ret = Math.max(ret,dp[i]);
        }
        return ret;
    }
}
