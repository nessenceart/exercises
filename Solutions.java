class Solution {
    public static int removeDuplicates(int[] nums) {
        int arrlength = nums.length;
        int i = 0;
        int j = 1;
        
        while (i < arrlength - 1){
        	if (nums[i] == nums[j]){
        		for (int k = j; k < arrlength-1; k++){
        			nums[k] = nums[k+1];
        		}
        		arrlength -= 1;
        	}else {
        		i += 1;
        		j = i + 1;
        	}
        }
        
        return arrlength;
    }
    public static void main(String[] args) {
    	int[] nums = new int[5];
    	nums[0] = 0;
    	nums[1] = 2;
    	nums[2] = 3;
    	nums[3] = 4;
    	nums[4] = 5;
    	
    	System.out.println(nums.length);
    	System.out.println(removeDuplicates(nums));
    }
}