package String_25_Questions;

public class VowelsandConsonentsCount 
{
    //Question 1:
   // Count the vowels and consonants.
   //  Return both as [vowels, consonants]
   //  Input to the function:  ['a','p','p','l','e'] 
   // Return from the function:  [2, 3]
   //TC: O(n)
   //SC:O(1)

   static void getVowelsCountandConsonentCount(char[] ch)
   {
    int res[] = new int[2];
    int VowelsCount = 0;
    int ConsonentCount = 0;

    for(int i = 0; i < ch.length; i++)
    {
        if( ch[i] == 'a'  ||
             ch[i] == 'e' || 
             ch[i] == 'i' ||
             ch[i] == 'o' || 
             ch[i] == 'u' || 
             ch[i] == 'A' || 
             ch[i]  == 'E'|| 
             ch[i] ==  'I'|| 
             ch[i] == 'O' ||  
             ch[i] == 'U' )
         {
            VowelsCount++;
         }

         else
        {
            ConsonentCount++;

         }

    }

    res[0] = VowelsCount;
    res[1] = ConsonentCount;

    //printing result
    for(int j = 0 ; j < res.length; j++)
    {
        System.out.println(res[j]);
    }

   }

   public static void main(String[] args) 
   {
    char [] ch = {'A', 'p','p','l','e'};
    getVowelsCountandConsonentCount(ch);
    
   }


    
}
