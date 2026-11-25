package Daily_Practice.Strings;

public class StringsDay1 
{

    //1. Single Character (char) Questions

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

    //10)Check whether a character is a digit or alphabet.
    static void isCharacterOrAlphabet()
    {
        // char ch =  'b';
        char ch = 69;
        if((ch >= 65 && ch <= 91 )|| (ch >= 97 && ch <= 122) )
        {
            System.out.println(ch + " is a character");
        }

        else if(ch >= 48 && ch <= 57)
        {
            System.out.println(ch + " is a digit");
        }
    }

    //11)Print the next five characters of a given character.
    static void printNextFiveChars()
    {
        //for char
        char ch = 'A';
        for(int i = 1; i <= 5; i++)
        {
            System.out.println((char)(ch+i));//o/p=>B,C,D,E,F
        }
        System.out.println();


        //digit as a char
        char num = '2';
        for(int i = 1; i <= 5; i++)
        {
            System.out.println((char)(num+i));//o/p=>3,4,5,6,7
        }
    }


    //12)Print the previous five characters of a given character.
    static void printPreviousFiveChars()
    {
        char ch = 'Z';
        for(int i = 1; i <= 5; i++)
        {
            System.out.println((char)(ch-i));
        }
    }


    //13)Print the ASCII values of uppercase letters A–Z.
    static void printASCIIOfUpperCaseLetters()
    {
        char ch = 'A';
        for(int i = 0; i <= 26; i++)
        {
            System.out.println((int)(ch+i));
        }
    }
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
       isCharacterOrAlphabet();
       printNextFiveChars();
       printPreviousFiveChars();
       printASCIIOfUpperCaseLetters();
        
    }

}

    

