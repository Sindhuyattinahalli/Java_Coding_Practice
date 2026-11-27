package SinglyLinkdLsit.Insertday_1;

/**
 * InsertAtStartPosition
 */
//Day-1
public class InsertAtStartPosition 
{
    private Node head;
    private int count;

    public InsertAtStartPosition()
    {
        this.head = null;
        this.count = 0;
    }

//inserrting

     void InsertAtStart(int value)
    {
        Node newNode = new Node(value);
        if(this.head == null)
        {
            this.head = newNode;
        }

        else
        {
          newNode.next = this.head;
          this.head =  newNode;

        }
        this.count++;
        

    

    }
//printing

void printAllNodes()
{
    System.out.println();
    System.out.print("head  -> ");
    Node walker = this.head;
    if(walker == null)
    {
        System.out.print("null");
    }
    else
    {
    while(walker != null)
    {
      System.out.print(walker.data + " -> ");
      walker = walker.next;
    }
    System.out.print("null");
    System.out.println();

   }
}

//Day-2


void insertAtEnd(int value)
{
    Node newNode = new Node(value);

    if(head == null)
    {
        head = newNode;
        return;
    }
    else
    {
        Node CurrentNode  = this.head;
        while(CurrentNode.next != null)
        {
            CurrentNode = CurrentNode.next;
        }
        CurrentNode.next = newNode; 

    }
    this.count++;

}

//insertatposition
void InsertAtPosition(int value, int position)
{
    if(position < 1 || position > this.count+1)
    {
        System.out.println("Invalid position");
    }

    if(position == 1)
    {
       this.InsertAtStart(value);
       return;
    }

    if(position == this.count+1)
    {
        this.insertAtEnd(value);
    }

    Node newNode = new Node(value);
    int count = 1;

    Node currentNode = this.head;

    while(count < position -1)
    {
        currentNode = currentNode.next;
        count++;
    }
    newNode.next = currentNode.next;

    currentNode.next = newNode;

    this.count++;
}

//Count total Nodes

 int getCountOfAllNodes()
{
    int count = 0;
    while(this.head != null)
    {
    if(this.head != null)
    {
        count++;

        this.head = this.head.next;
    }
}
    return count;
}


//Day-3

//Delete Operation
//deleteAtStart
void deleteAtStart()
{
    //if list is empty
    if(this.head == null)
    {
        return;
    }
    

    //if list has one or  more than one
    this.head = this.head.next;
    this.count--;
}

//deleteatEnd
void deleteAtEnd()
{
    if(this.head == null)
    {
        System.out.println(" List is Empty");
        return;
    }

    if(this.head.next == null)
    {
        this.head = null;
    }

    Node CurrentNode = this.head;
    while(CurrentNode.next.next != null)
    {
        CurrentNode = CurrentNode.next;
    }
    CurrentNode.next = null;
    this.count--;
}

//deleteAtPosition
void deleteAtPosition(int position)

{
    if(this.head == null)
    {
        return;
    }

    if(this.head.next == null)
    {
        this.head = null;
    }


     Node currentNode = this.head;
     count =1;

     while(count < position-1)
     {
        currentNode = currentNode.next;
     }
     currentNode.next = currentNode.next.next;
     this.count--;

}
}