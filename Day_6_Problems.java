public class Day_6_Problems {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){      //outer for rows
            for(int j=0;j<i;j++){      //inner for columns
                System.out.print("y ");
            }
            System.out.println("");
        }


        //Two sum
        /*class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }
} */
    }
}