package Arrays_25_Questions;

public class AverageMarks 
{
    static double AverageMarks(int[] nums)
    {
        int count = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++)
        {
            count++;
            sum = sum+nums[i];
        }
        
        double average = (double) sum/count;

        return average;


    }

    public static void main(String[] args) 
    {
        int[]  nums = {90,87,67,75};
        double res = AverageMarks(nums);
        System.out.println(res);

        
    }
    
}
