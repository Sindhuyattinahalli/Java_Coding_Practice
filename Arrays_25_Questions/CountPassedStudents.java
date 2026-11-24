package Arrays_25_Questions;

public class CountPassedStudents 
{
    static int getCountPassedStudents(int [] Marks)
    {
        int count = 0;
        for(int i = 0; i < Marks.length; i++)
        {
            if(Marks[i] >= 35)
            {
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) 
    {
        int[] Marks = { 40,22,35,90,18};
        int res = getCountPassedStudents(Marks);
        System.out.println(res);
        
    }
    
}

    

