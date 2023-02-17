public class CountOddNumbersIn {
    public int countOdds(int low, int high) {
        var nums = (high - low + 1) / 2;
        return high % 2 != 0 && low % 2 != 0 ? nums + 1 : nums;

    }
}
