class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIndex = 0, maxIndex = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] < nums[minIndex]) minIndex = i;
            if(nums[i] > nums[maxIndex]) maxIndex = i;
        }
        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);
        // option -> 1
        int front = right + 1;
        // option -> 2
        int back = n - left;
        // option -> 3
        int frontBack = (left + 1) + (n - right);
        return Math.min(front, Math.min(back, frontBack));
    }
}