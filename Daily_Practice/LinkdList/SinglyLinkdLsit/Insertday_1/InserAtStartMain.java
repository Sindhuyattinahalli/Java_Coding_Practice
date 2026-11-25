package Daily_Practice.LinkdList.SinglyLinkdLsit.Insertday_1;

/**
 * InserAtStartMain
 */
public class InserAtStartMain
{

    public static void main(String[] args) 
    {
      InsertAtStartPosition obj = new InsertAtStartPosition();
        Node head = null;
       obj. printAllNodes(head);

        head  = obj.InsertAtStart(20, head);
        obj.printAllNodes(head);

        head  = obj.InsertAtStart(30, head);
        obj.printAllNodes(head);

        head  = obj.InsertAtStart(40, head);
        obj.printAllNodes(head);

       // o/p
        //heda -> null
        // head-> 20 -> null
        //head-> 30-> 20-> null

        int res = obj.getCountOfAllNodes(head);
        System.out.println("count of all nodes : " + res);


        

        
    }

    
}