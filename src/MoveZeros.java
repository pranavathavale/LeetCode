public class MoveZeros {
    /* 283. Move Zeroes
    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    Note that you must do this in-place without making a copy of the array.*/
        public void moveZeroes(int[] nums) {
            int k = 0;
            for(int i = 0; i < nums.length; i++)
            {
                if (nums[i] != 0)
                {
                    nums[k] = nums[i];
                    k++;
                }
            }
            for(int i = k; i < nums.length; i++)
            {
                nums[i] = 0;
            }

        }
}

