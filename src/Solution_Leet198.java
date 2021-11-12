/**
 * 198. 打家劫舍
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，
 * 影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，
 * 一夜之内能够偷窃到的最高金额。
 */
public class Solution_Leet198 {

    public int helper(int []nums){
        int n = nums.length;
        if (n == 0 ) return  0;
        int[] dp = new int[n+2];//偷的棋阿菜

        for (int i = n - 1;i>=0;i--){
            //dp[i]表示从i坐标开始可以截获的最大钱财
            //dp[n]=0:最后一个房屋对应第n-1
            dp[i] = Math.max(dp[i+1],dp[i+2] + nums[i]);
        }
        return dp[0];
    }
}
