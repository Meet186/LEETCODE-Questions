class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int i=0,j=0;
        int bestminLen = Integer.MAX_VALUE;
        int[] minBestTillIdx = new int[n];
        int result = Integer.MAX_VALUE;
        int currsum = 0;
        while(j < n){
            currsum += arr[j];
            while(i < j && currsum > target){
                currsum -= arr[i];
                i++;
            }
            if(currsum == target){
                int len = j-i+1;
                if(i > 0 && minBestTillIdx[i-1] != Integer.MAX_VALUE){
                    result = Math.min(result,len+minBestTillIdx[i-1]);
                }
                bestminLen = Math.min(bestminLen,len);
            }
              minBestTillIdx[j] = bestminLen;
              j++;
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}