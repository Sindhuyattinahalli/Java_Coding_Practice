package Arrays_25_Questions;

public class EvenIndexSum 
{

    static int getSumOfEvenIndex(int[] nums)
    {
        int sum =0;
        for(int i = 0; i < nums.length; i++)
        {
            if(i % 2 == 0)
            {
                sum = sum+nums[i];
            }
        }
        return sum;
    }
    
    public static void main(String[] args) 
    {
        int[] nums = {1,2,3,4,5,6};
        int res = getSumOfEvenIndex(nums);
        System.out.println(res);
        
    }
}
