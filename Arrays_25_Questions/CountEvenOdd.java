package Arrays_25_Questions;

import java.util.Arrays;

public class CountEvenOdd
{
    static int[] CountEvenodd(int[] nums)
    {
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i < nums.length;i++)
        {
            if(nums[i] % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
        int res[] = {oddCount,evenCount};
        return res;
    }

    public static void main(String[] args)
    {
        int[] nums = {10,9,4,7,6};
        int res[] = CountEvenodd(nums);
        System.out.println(Arrays.toString(res));
        
    }
    
}
