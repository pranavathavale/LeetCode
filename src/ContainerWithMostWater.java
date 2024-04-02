public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        int minHeight = 0;
        int distance = 0;
        int maxArea = 0;
        while (left < right)
        {
            minHeight = Math.min(height[left], height[right]);
            distance = right - left;
            area = minHeight * distance;
            if(area > maxArea)
            {
                maxArea = area;
            }
            if(height[left] < height[right])
            {
                left++;
            }
            else {
                right--;
            }

        }
        return maxArea;
    }
}
