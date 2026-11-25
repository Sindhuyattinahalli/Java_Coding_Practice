package Arrays_25_Questions;

public class Palindrome 
{
    //Questions
    // Return how many numbers are palindromes (read the same both ways, like 121). 
    // Input to the function:  [121, 45, 7, 1331, 80] 
    // Return from the function:  3
    //Tc:O(n)
    //Sc:O(1)

    static int CountPalindrome(int [] nums)
    {
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int reverse = 0;
            int result = nums[i];

            while(nums[i] != 0)
            {
                int rem = nums[i] % 10;
                reverse = (reverse * 10)+ rem;
                nums[i] = nums[i]/10;
            }

            if(reverse == result)
            {
                count++;
            }

        }

        return count;
    }
    public static void main(String[] args) 
    {
        int [] nums = {121, 45, 7, 1331, 80};
        int count = CountPalindrome(nums);
        System.out.println(count);
        
    }
    
}
