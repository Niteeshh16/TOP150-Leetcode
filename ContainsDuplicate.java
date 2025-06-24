//Return true if the duplicate in the array, else return false

public class ContainsDuplicate {


    public static void findDuplicate(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    System.out.println("Duplicate");
                    return;
                }

            }

        }
        System.out.println("Not duplicate");



    }



    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
       findDuplicate(nums);

    }
}
