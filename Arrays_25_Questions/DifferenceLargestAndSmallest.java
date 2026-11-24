package Arrays_25_Questions;

public class DifferenceLargestAndSmallest 
{

    static int getDifference(int[] nums)
    {
    int largest = nums[0];
    int smallest = nums[0];

    for(int i = 0 ; i < nums.length; i++)
    {
        if(nums[i] > largest)
        {
            largest = nums[i];
        }

        if(nums[i] < smallest)
        {
            smallest =  nums[i];
        }
    }

    int difference = largest - smallest;

    return difference;
    }

    public static void main(String[] args) 
    {
        int[] nums = {10,90,45,78,3,100};
        int res = getDifference(nums);
        System.out.println(res);
        
    }

    
}
