class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         int capacity = 0;
        int length = flowerbed.length;
        
        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == length - 1 || flowerbed[i + 1] == 0)) {
                
                flowerbed[i] = 1;
                capacity++;
                i++;
                
                if (capacity >= n) return true;
            }
        }

        return capacity >= n;
    }
}