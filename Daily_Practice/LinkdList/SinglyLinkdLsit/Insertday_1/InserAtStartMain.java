package SinglyLinkdLsit.Insertday_1;

/**
 * InserAtStartMain
 */
public class InserAtStartMain
{

    public static void main(String[] args) 
    {
      InsertAtStartPosition obj = new InsertAtStartPosition();
      
       obj. printAllNodes();

        obj.InsertAtStart(20);
        obj.printAllNodes();

        obj.InsertAtStart(30);
        obj.printAllNodes();

        obj.InsertAtStart(40);
        obj.printAllNodes();

       // o/p
        //heda -> null
        // head-> 20 -> null
        //head-> 30-> 20-> null

        // int res = obj.getCountOfAllNodes();
        // System.out.println("count of all nodes : " + res);

        obj.InsertAtStart(10);
        obj.InsertAtStart(20);
        obj.insertAtEnd(100);
        obj.InsertAtPosition(50, 1);
        obj.printAllNodes();
        obj.InsertAtPosition(200, 5);
        obj.InsertAtPosition(80, 4);
        obj.printAllNodes();


        

        
    }

    
}