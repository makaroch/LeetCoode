public class ShuffleTheArray {
    static public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for (int i = 0, j = n, k = 0; i < nums.length / 2; i++, j++, k++) {
            arr[k++] = nums[i];
            arr[k] = nums[j];
        }
        return arr;
    }
}
