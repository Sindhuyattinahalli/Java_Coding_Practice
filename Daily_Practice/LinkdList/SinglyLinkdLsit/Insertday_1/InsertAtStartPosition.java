package Daily_Practice.LinkdList.SinglyLinkdLsit.Insertday_1;

/**
 * InsertAtStartPosition
 */
public class InsertAtStartPosition 
{
//inserrting
    static Node InsertAtStart(int value, Node localhead)
    {
        Node newNode = new Node(value);
        if(localhead == null)
        {
            return newNode;
        }

        else
        {
        newNode.next = localhead;
        return newNode;
    }
    

}
//printing

static void printAllNodes(Node localhead)
{
    System.out.println();
    System.out.print("head  -> ");
    if(localhead == null)
    {
        System.out.print("null");
    }
    else
    {
    while(localhead != null)
    {
      System.out.print(localhead.data + " -> ");
      localhead = localhead.next;
    }
    System.out.print("null");
    System.out.println();

   }
}

//Count total Nodes

static  int getCountOfAllNodes(Node localhead)
{
    int count = 0;
    while(localhead != null)
    {
    if(localhead != null)
    {
        count++;

        localhead = localhead.next;
    }
}
    return count;
}
}