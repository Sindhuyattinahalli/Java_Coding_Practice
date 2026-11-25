package Daily_Practice.Strings;

public class StringsDay2 
{
    //2. Character Array (char[]) Questions
    //level--1

    //1)Create a character array, initialize it, and print all characters.
    //Time Complexity : O(n)
    //space complexity : o(1)
    static void CreateCharandprint()
    {
        char[] ch = {'A', 'B', 'c'};
        for(int i = 0; i < ch.length; i++)
        {
            System.out.println(ch[i]);
        }
    }

    //2)Create a character array using partial initialization.
    //Time Complexty : O(n)
    //Space Complexity : O(1)
    static void   CreatecharArray()
    {
        char [] ch = new char[5];
            ch[0] = 'A';
            ch[1] = 'B';
            ch[2]  = 'C';
            for(int i = 0; i < ch.length; i++)
            {
                System.out.println(i + "-> " + ch[i]);
            }

    }

    //3)Count the total number of characters in a character array.
    //time Complexity:O(n)
    //SC: O(1)
    static void CountChars()
    {
        char ch[] = {'2','A', '6', '8','9'};
        int count = 0;
        for(int i = 0; i < ch.length; i++)
        {
            count++;
        }
        System.out.println("Chars Count: "+ count);
    }


    //4)Store ASCII values in a character array and print the characters.
    //TC:O(n)
    //SC: O(1)
    static void PrintChars()
    {
        char ch[] = {102, 103, 108, 121, 122};
        for(int i = 0; i < ch.length; i++ )
        {
            System.out.println((char)ch[i]);
        }
    }

    //5)Count uppercase and lowercase characters.
    //i/p = ['A', 'p','p','L','e']
    //o/p-> [2,3]=> [uppercaseCount, lowercaseCount]
    static void CountUpperCaseLowerCase()
    {
        int res[] = new int[2];
        char ch[] = {'A', 'p', 'p', 'L','e'};
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        for(int i =0; i < ch.length; i++ )
        {
            if(ch[i] >= 65  && ch[i] <= 91)
            {
                uppercaseCount++;
            }
            else
            {
                lowercaseCount++;
            }
        }
        res[0] = uppercaseCount;
        res[1] = lowercaseCount;

        for(int j = 0; j < res.length; j++)
        {
            System.out.println(res[j]);
        }
    }












    public static void main(String[] args) 
    {
        CreateCharandprint();
        CreatecharArray();
        CountChars();
        PrintChars();
        CountUpperCaseLowerCase();
        
    }
    
}
