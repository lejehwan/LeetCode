class Solution {
    public int pivotIndex(int[] nums) {
        int answer = -1;
        int left = 0;
        int right = 0;
        for(int i = 0; i < nums.length; i++){
            right += nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            left += nums[i];
            if(left == right){
                answer = i;
                break;
            }else{
                right -= nums[i];
            }
        }
        return answer;
    }
}