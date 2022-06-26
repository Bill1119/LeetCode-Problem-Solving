class Solution {
    
    
    public int[] searchRange(int[] nums, int target) {
        
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        // one method solution
        findFirstLastNum(nums,res,target);
        findFirstLastNum(nums,res,target);
        
        // try two methods(findfirst and findlast) solution next day
        
        return res;                
    }
    // iimplement the binary search algorithm with one method
    private void findFirstLastNum(int[] nums,int[] res, int target){
        int len =nums.length;
        
        int mid = 0;
        int left = 0;
        int right = len - 1;
        
        while(left<=right){
            mid = (right + left)/2;
            if(nums[mid] == target){
                 if(res[0] == -1){
                    
                    if(mid == left || nums[mid-1] != target){
                        res[0] = mid;
                        break;
                    }    
                    
                    right = mid -1;
                
                }
                else {
                   
                    if(mid == right || nums[mid+1] != target){
                        res[1] = mid;
                        break;
                    }
                    
                    left = mid + 1;
                }
            }
           
            else if(target<nums[mid]){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
            
        }
        
    }
}