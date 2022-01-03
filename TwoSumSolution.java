import java.util.Arrays;

/**
 * Solution for TwoSum problem
 */
public class TwoSumSolution {

    /**
     * finds indices that give target when added to one another
     * @param nums int array
     * @param target sum of two indices that needs to be found
     * @return indices that give target when added to one another
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int b = 1; b < nums.length; b++) {
                if (nums[i] + nums[b] == target) {
                    return new int[] {i, b};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 0;
        nums[1] = 4;
        nums[2] = 7;
        nums[3] = 8;
        int target = 4;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

}