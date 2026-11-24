package Arrays_25_Questions;

import java.util.Arrays;

public class ReplaceNegativeNumber 
{
    static int[] replaceNegativeValues(int [] nums)
    {
        int a[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < 0)
            {
                a[i] = 0;
            }
            else
            {
                a[i] = nums[i];
            }
        }
        return a;
    }

    // static void printElements(int[] nums)
    // {
    //     for(int i = 0; i < nums.length; i++)
    //     {
    //         System.out.println(nums[i]);
    //     }
    // }
    

    public static void main(String[] args) 
    {
        int[]  nums = {5,-3,8,-1,0};
        int res[] = replaceNegativeValues(nums);
        //printElements(res);
        System.out.println(Arrays.toString(res));
        

        
    }
}
