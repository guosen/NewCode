import java.util.*;


public class Solution_NC105 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 如果目标值存在返回下标，否则返回 -1
     * @param nums int整型一维数组 
     * @param target int整型 
     * @return int整型 1 2 4 4 5 5 5 8 9                     /5
     */
    public int search (int[] nums, int target) {
        // write code here
        int l = 0;
        int r = nums.length-1;
        int mid = (l+r)/2;
        int result = -1;
        while(l<=r){
            mid = (l+r)/2;
            if(target ==nums[mid] ){
                while(mid!=0 && nums[mid] == nums[mid - 1]){
                    mid --;
                }
                return mid;
            }
            if(target>nums[mid]){
                l = mid+1;
            }

            if(target<nums[mid]){
                r = mid-1;
            }



        }
        return result;
    }
}