//169 Majority Element


public class MajorityElement {

    public int element(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                return nums[i];
            }
        }
        return -1; // No majority element existed
    }

    public static void main(String[] args) {
        MajorityElement m = new MajorityElement();
        int[] nums = {3, 2, 3};
        System.out.println("Majority Element: " + m.element(nums));
    }
}
