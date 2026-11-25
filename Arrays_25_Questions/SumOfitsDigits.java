package Arrays_25_Questions;

public class SumOfitsDigits 
{

    // Return a new array where each number is replaced by the sum of its digits. 
    // Input to the function:  [123, 45, 9]
    // Return from the function:  [6, 9, 9]

    static int[]  getSumofDigits(int[] nums)
    {
        int res[] = new int[nums.length];

        for(int i = 0; i < nums.length; i++)
        {
            int sum = 0;

            while( nums[i] !=0 )
            { 
                int rem = nums[i] % 10;
                sum = sum + rem;
                nums[i] = nums[i]/10;
            }

            res[i] = sum;

        }

        return res;
    }

    public static void main(String[] args) 
    {
        int[] nums = {123, 45, 91};
        int [] sum = getSumofDigits(nums);
         
        // returning res elemts to sum array and printing result elements using sum array
        for(int i = 0; i < sum.length; i++)
        {
            System.out.println(sum[i]);
        }
        
    }

    
}
