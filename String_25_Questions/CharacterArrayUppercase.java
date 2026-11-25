package String_25_Questions;

public class CharacterArrayUppercase 
{
    //Return the array with every letter in capitals.
   //Input to the function: ['c','o','d','e']
   //Return from the function: ['C','O','D','E']
   //Tc:O(n)
   //SC:O(1)
    static void ConvertUppercase()
    {
        char ch[] = {'c','o','d','e'};

        for(int i = 0; i < ch.length; i++)
        {
            System.out.println((char)(ch[i] - 32));
        }

    }
    public static void main(String[] args)
    {
        ConvertUppercase();
        
    }
    
}
