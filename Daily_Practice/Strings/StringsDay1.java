package Daily_Practice.Strings;

public class StringsDay1 
{

    //1. Single Character (char) Questions
    //level 1-- Questions

    //1)print char and its ASCII
    //Time and Space complexity  of   all 1. Single Character (char) Questions level 1-- Questions is
    //Time Complexity : O(1)
    //Space Complexity : O(1)
    static void printCharAndASCII() 
    {
        char ch = 'A';
        System.out.println(ch );//o/p=>A
        System.out.println((int) ch);//o/p=>65

    }

    //2)Assign an ASCII value to a char variable and print the character.
    static void PrintCharacter()
    {
        char ch = 68;
        System.out.println(ch);//o/p=>D
    }


    //3)Print the current character and its next character.
    static void PrintCurrentCharAndNextChar()
    {
        char ch = 'D';
        System.out.println(ch);
        System.out.println((char)(ch+1));//o/p=>E
    }

    //4)Print the previous character of a given character.
    static void printPreviousChar()
    {
        char ch = 'Z';
        System.out.println(ch);
        System.out.println((char)(ch-1));//o/p=>Y
    }

    //5)Convert an uppercase character into lowercase.
    static void getLowerCaseChar()
    {
        char ch = 'A';
        System.out.println((char)(ch+32));//o/p=>a
    }

    //6)Convert a lowercase character into uppercase.
    static void getUpperCase()
    {
        char ch = 'b';
        System.out.println((char)(ch-32));//o/p=>
    }


    //7)Print the ASCII values of digits from 0 to 9.
    static void getASCIIOfDigits()
    {
        for(int i = 0; i <=9; i++ )
        {
            System.out.println(('0' + i));//o\p=> 48,49,50,-------57;
        }
    }

    //8)Check whether a character is uppercase 
    static void isUpperCase()
    {
        char ch = 'H';
        boolean result = false;

        if(ch >= 65 && ch <= 91)
        {
            result =  true;
        }
        else
        {
            result =  false;

        }

        System.out.println(result);
    }


    //9)Check whether a character is lowercase
    static void isLowerCase()
    {
        char ch = 'B';
        boolean result = false;

        if(ch >= 97 && ch <= 122)
        {
            result = true;
        }
        else
        {
            result = false;
        }

        System.out.println(result);
    }

    //10)s




    public static void main(String[] args) 
    {
       printCharAndASCII(); 
       PrintCharacter();
       PrintCurrentCharAndNextChar();
       printPreviousChar();
       getLowerCaseChar();
       getUpperCase();
       getASCIIOfDigits();
       isUpperCase();
       isLowerCase();
        
    }

}

    

