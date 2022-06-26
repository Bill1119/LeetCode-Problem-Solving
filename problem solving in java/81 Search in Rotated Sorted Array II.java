class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        boolean res = false;
        
        while(left <= right){
           if(nums[left]==target){
               res = true;
               return res;
           }
           else{
               left = left+1;
           }
            
           if(nums[right] == target){
               res = true;
               return res;
           } 
           else{
               right = right -1;
           } 
            
        }
        
        
        
        return res;
    }
}