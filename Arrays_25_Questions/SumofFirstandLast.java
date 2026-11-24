package Arrays_25_Questions;

public class SumofFirstandLast 
{
    static int getSumofFirstlast(int [] nums)
    {
        int sum = 0;
        sum = nums[0] + nums[nums.length-1];

        return sum;
    }

    public static void main(String[] args) 
    {
        int [] nums = {7,3,9,4};
        int res = getSumofFirstlast(nums);
        System.out.println(res);
        
    }
    
}
