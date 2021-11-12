public class Solution_NC140 {
    /**
     * 快速排序
     * 描述
     * 给定一个长度为 n 的数组，请你编写一个函数，返回该数组排序后的结果。
     * 数据范围： 0 \le n \le 10000000≤n≤1000000，数组中每个元素都满足 0 \le val \le 10000000000≤val≤1000000000
     * 要求：空间复杂度 O(n)O(n)，时间复杂度 O(nlogn)O(nlogn)
     * @param arr
     * @return
     */
    public int[] MySort (int[] arr) {
        if(arr == null || arr.length == 0){
            return new int[0];
        }
        quickSort(arr,0,arr.length-1);
        return arr;
    }

    public  void quickSort(int[] data, int left, int right) {
        if (left < right) {
            int index = Partition(data, left, right);
            quickSort(data, left, index-1);
            quickSort(data, index+1, right);
        }
    }

    public int Partition(int[]data,int start,int end){
        if(data == null || data.length == 0 || start < 0 || end < 0){
            return 0;
        }

        int i = start;
        int key = data[i];
        int j = end;
        while(i!=j){
            while(i<j && data[j]>=key){
                j--;
            }
            if(i<j){
                data[i] = data[j];
                i++;
            }

            while(i<j && data[i]<=key){
                i++;
            }
            if(i<j){
                data[j] = data[i];
                j--;
            }

        }
        data[i] = key;
        return i;
    }
}
