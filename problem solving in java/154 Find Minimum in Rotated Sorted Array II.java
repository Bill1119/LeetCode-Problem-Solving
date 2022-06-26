class Solution {
    public int findMin(int[] nums) {
        
        // not a regular solution for the question but works well
        int left = 0;
        int right = nums.length-1;
        
        int head = 0;
        int tail = 0;
        int minRes = Integer.MAX_VALUE;     //Integer.MAX_VALUE;
        while(left<=right){
            head = nums[left];
            tail = nums[right];
            
            minRes = Math.min(minRes,head);
            minRes = Math.min(minRes,tail);
            
            left = left+1;
            right = right-1;
        }
        
        return minRes;
        
    }
}