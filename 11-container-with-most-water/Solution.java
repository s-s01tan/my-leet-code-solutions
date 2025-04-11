class Solution {
    public static int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        int maxArea = 0;

        while (leftIndex < rightIndex) {
            int currentArea = calculateArea(height, leftIndex, rightIndex);
            maxArea = Math.max(maxArea, currentArea);

            if (height[leftIndex] < height[rightIndex]) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }

        return maxArea;
    }

    public static int calculateArea(int[] height, int leftIndex, int rightIndex) {
        return Math.min(height[leftIndex], height[rightIndex]) * (rightIndex - leftIndex);
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxArea(height);
        System.out.println(result); // Output: 49

        int[] height2 = {1,1};
        int result2 = maxArea(height2);
        System.out.println(result2); //output 1
    }
}