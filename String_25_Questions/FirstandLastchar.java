package String_25_Questions;

public class FirstandLastchar
{
// Return the first and the last character as a new array.
// Input to the function: ['m','a','n','g','o']
// Return from the function: ['m','o']
//TC:O(n)
//SC:O(1)

static void printFirstandLastchar()
{
    char ch[] = {'m', 'a', 'n', 'g' , 'o'};
    char res[] = new char[2];

    res[0] = ch[0];
    res[1] = ch[ch.length-1];

    //printing new char array
    for(int i = 0; i < res.length; i++)
    {
        System.out.println(res[i]);
    }
}

public static void main(String[] args) 
{
    printFirstandLastchar();
    
}
    
}
