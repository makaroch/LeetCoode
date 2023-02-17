public class SearchInsertPosition {
// 0 1 2 3 4 5 6 7 8 9 10
   static public int searchInsert(int[] nums, int target) {
       ; if (target > nums[nums.length -1]){
           return nums.length;
       }
       if (target < nums[0]){
           return 0;
       }
       int leftNum = 0;
       int rigthNum = nums.length-1;

       while (leftNum <= rigthNum){
           //left_border + ((right_border - left_border) // 2)
           int midl = leftNum + ((rigthNum - leftNum) /2);

           if (nums[midl] == target) {
               return midl;
           } else if (nums[midl] < target){
               leftNum = midl + 1;
           } else rigthNum = midl - 1;
       }
       return rigthNum+1;
    }
}
