public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int leftTotal = 0;
        int rightTotal = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if( i != 0)
            {
                for(int j = 0; j < i; j++)
                {
                    leftTotal += nums[j];
                }
            }

            if (i != nums.length - 1)
            {
                for(int k = i + 1; k < nums.length; k++)
                {
                    rightTotal += nums[k];
                }
            }
            if(leftTotal == rightTotal)
            {
                return i;
            }
            leftTotal = 0;
            rightTotal = 0;
        }
        return -1;
    }
}
