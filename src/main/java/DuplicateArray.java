public class DuplicateArray {
    public boolean duplicate(int[] nums, int length, int[] duplication) {
        if(null == nums || length <=0 || nums.length <= 0 ){
            return false;
        }
        for(int i=0;i<length;i++){
            while (nums[i]!=i){
                if(nums[i]==nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return true;
                }
                int temp = nums[i];
                nums[i] = nums[nums[i]];
                nums[nums[i]] = temp;
            }

        }
        return false;
    }
}
