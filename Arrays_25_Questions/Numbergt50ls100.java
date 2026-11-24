package Arrays_25_Questions;

public class Numbergt50ls100 
{

    static int[] getElementsgreaterthan50Lessthan100(int[] nums)
    {
        
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 50 && nums[i] <100)
            {
                count++;
            }
        }
        int res[] = new int[count];
             
        int j = 0;

            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] > 50 && nums[i] < 100)
                {
                    res[j]  =nums[i]; 
                    j++;
                      
                }
            }

            return res;    
    }

    static void printElements(int[] nums)
    {
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) 
    {
        int[] nums = { 90,23,56,76,32,67};
        int res[] = getElementsgreaterthan50Lessthan100(nums);
        printElements(res);
        
    }
    
}
