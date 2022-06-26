class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String str = String.valueOf(x);
        char[] number = str.toCharArray();
        int left =0;
        int right = number.length -1;
        
        while(left<=right){
            if(number[left] != number[right]){
                return false;
            }
            
            left = left +1;
            right = right -1;
        }
        
        return true;
    }
}