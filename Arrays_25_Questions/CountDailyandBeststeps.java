package Arrays_25_Questions;

import java.util.Arrays;

public class CountDailyandBeststeps 
{
    static int[] getCountandBestSteps(int[] steps)
    {
        int count = 0;
        int Max= steps[0];
        int a[] = new int[2];
        for(int i = 0; i < steps.length; i++)
        {
            if(steps[i] > 10000)
            {
                count++;
            }

            if(steps[i] > Max)
            {
                Max = steps[i];
            }
        }
        a[0] = count;
        a[1] = Max;
    return a;
    
    }

    public static void main(String[] args)
    {
     int[] steps = {8000,12000,10500,9000,15000};
     int res[] = getCountandBestSteps(steps);
     System.out.println(Arrays.toString(res));
        
    }
}
