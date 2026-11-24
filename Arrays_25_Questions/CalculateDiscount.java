package Arrays_25_Questions;

public class CalculateDiscount 
{
    static int getDiscountedPrice(int[] nums,int DiscountPercentage)
    {
        int total = 0;  
        int discount = 0;
        for(int i = 0; i < nums.length; i++)
        {
            total = total+nums[i];  
        }

        if(total >= 1000)
        {
            discount = (total * DiscountPercentage )/100;
        }

        int Final_Price = total - discount;

        return Final_Price;
    }

    public static void main(String[] args)
    {
        int[] nums = {400,350,450};
        int res = getDiscountedPrice(nums,10);
        System.out.println(res);
        
    }
    
}
