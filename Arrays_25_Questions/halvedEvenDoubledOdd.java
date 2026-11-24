package Arrays_25_Questions;

public class halvedEvenDoubledOdd 
{
    static int[] getHalvedAndDoubledArray(int[] nums)
    {
       int[] res = new int[nums.length];
       int j = 0;
       for(int i = 0; i < nums.length; i++)
       {
        if(nums[i] % 2 == 0)
        {
            res[j] = nums[i]/2;
            j++;
        }

        if(nums[i] % 2 != 0)
        {
            res[j] = nums[i] * 2;
            j++;
        }
       }
       return res;
    }


    static void printElements(int[] nums)
    {
        for(int i = 0; i < nums.length;i++)
        {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) 
    {
        int[] nums = {4,7,10,3};
        int[] res = getHalvedAndDoubledArray(nums);
        printElements(res);

        int[] nums1 = {2, 4, 6, 8};
        int[] res1 = getHalvedAndDoubledArray(nums1);
        printElements(res1);

        int[] nums2 = {-2, -3, 4, 5};
        int[] res2 = getHalvedAndDoubledArray(nums2);
        printElements(res2);
        
    }
    
}

