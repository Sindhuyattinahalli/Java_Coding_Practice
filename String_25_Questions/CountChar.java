package String_25_Questions;

public class CountChar 
{
//Return how many times a given character appears.
//Return from the function: 3
//Tc:O(n)
//Sc:O(1)

static void CountGivenChar()
{
    char [] ch = {'b','a','n','a','n','a'};
    char target = 'a';
    int count = 0;

    for(int i = 0; i < ch.length; i++)
    {
        if(ch[i] == target)
        {
            count++;
        }
    }
    System.out.println("Count of given char is : " + count);
}

public static void main(String[] args) 
{
    CountGivenChar();
    
}
    
}
