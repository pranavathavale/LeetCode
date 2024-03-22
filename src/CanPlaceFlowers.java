public class CanPlaceFlowers {
    /*
    Can Place Flowers
    You have a long flowerbed in which some of the plots are planted, and some are not.
    However, flowers cannot be planted in adjacent plots.
    Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
    return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
     */
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            boolean result = true;
            //We check if we can plant at i.
            for(int i = 0; i < flowerbed.length; i++)
            {
                //No flowers to plant
                if (n == 0)
                {
                    return true;
                }

                //If index i == 1 then skip the next one by adding i = i + 1 and continuing the loop.
                if (flowerbed[i] == 1)
                {
                    i = i + 1;
                    continue;
                }

                //if last element or next element is 0 then we can plant flower. Else we need to skip 2 places.
                if(i == flowerbed.length - 1 || flowerbed[i + 1] == 0)
                {
                    n--;
                    i = i + 1;
                }
                else
                {
                    i = i + 2;
                }
            }
            return n == 0;
        }
}