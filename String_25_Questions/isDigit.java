package String_25_Questions;

public class isDigit 
{
// Return true if the array contains at least one digit.
// Input to the function: ['p','a','s','s','1']
// Return from the function: true
//TC:O(n)
//SC:O(1)

static void isDigitPresent()
{
    char ch[] = {'p','a', 's','s','1'};
    boolean result =  false;
    for(int i = 0; i < ch.length; i++)
    {
        if(ch[i] >= 48 && ch[i] <= 57)
        {
            result = true;
        }
        else
        {
            result = false;
        }
    }
    System.out.println(result);

}
public static void main(String[] args) 
{
    isDigitPresent();
    
}
    
}
