class Solution {
    public int search(int[] nums, int target) {
        // 1- take the middle and compare with target, if matches return.
        // 2- if middle is bigger than left side, it means left is sorted
        // 2a- if [left] < target < [middle] then do recursion with left, middle - 1 (right)
        // 2b- left side is sorted, but target not in here, search on right side middle + 1 (left), right
        // 3- if middle is less than right side, it means right is sorted
        // 3a- if [middle] < target < [right] then do recursion with middle + 1 (left), right
        // 3b- right side is sorted, but target not in here, search on left side left, middle -1 (right)
        
        
        // find mid index, compare with mid and target, and also compare mid and target with nums[0] and nums[num.length-1]
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        
        while(left<=right){
            mid = (right + left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if (nums[mid]>=nums[left]){
                if(nums[mid]>target && target >= nums[left]){
                    right = mid -1;    
                }
                else{
                    left = mid + 1;
                }
            }
            else{
                if(nums[mid]< target && target <= nums[right]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
                
            }
            
            
        }
    
    return -1;
    }
}