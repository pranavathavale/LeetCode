import java.util.ArrayList;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] outputArray = new int[2];
        ArrayList<Integer> numsList = new ArrayList<Integer>();
        for(int num: nums)
        {
            numsList.add(num);
        }
        System.out.println(numsList);
        if(nums.length == 2)
        {
            outputArray[1] = 1;
            return outputArray;
        }
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = nums.length - 1; j >= 0; j--)
            {
                if(j == i)
                {
                    continue;
                }
                if(nums[i] == nums[j] && nums[i] + nums[j] == target)
                {
                    outputArray[0] = numsList.indexOf(nums[i]);
                    numsList.remove(i);
                    outputArray[1] = numsList.indexOf(nums[j]) + 1;
                    return outputArray;
                }
                else if(nums[i] + nums[j] == target)
                {
                    outputArray[0] = numsList.indexOf(nums[i]);
                    outputArray[1] = numsList.indexOf(nums[j]);
                    return outputArray;
                }
            }
        }
        return outputArray;
    }
}
