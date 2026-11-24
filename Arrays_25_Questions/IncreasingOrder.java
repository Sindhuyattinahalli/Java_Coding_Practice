package Arrays_25_Questions;

public class IncreasingOrder 
{
    static boolean isIncreasingOrder(int [] nums)
    {
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i] >= nums[i+1] )
            {
                return false;
            }
           
        }
        return  true;
    }

    public static void main(String[] args) 
    {
        int[] nums = {2,5,9,14};
        boolean res = isIncreasingOrder(nums);
        System.out.println(res);


        
    }
        
}
