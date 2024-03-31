package haroon.week7_part2;

public class MoveZeroToEnd {

    public static void moveZeroToEnd(int[] nums){
        if (nums == null|| nums.length==0)
            return;
        int insertPos = 0;

        for (int eachNum : nums) {
            if (eachNum != 0){
                nums[insertPos++] = eachNum;
            }
        }
        while (insertPos < nums.length){
            nums[insertPos++] =0;

        }
    }

    public static void main(String[] args) {
        int [] nums = {1,0,2,0,3,0,4,0};
        moveZeroToEnd(nums);
        for (int eachNum : nums) {
            System.out.print(eachNum + " ");

        }
    }

}
