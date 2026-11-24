package Arrays_25_Questions;

public class HotterTemperature
{
    static int getCountOfHotterDays(int[] nums)
    {
        int count = 0;
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i] < nums[i+1])
            {
                count++;

            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        int [] nums = {30,32,31,35,36,34,37};
        int res = getCountOfHotterDays(nums);
        System.out.println(res);
        
    }
    
}
