public class MyLinkedList {

    Node head;


    public MyLinkedList()
    {
       head=null;
    }

    public void insertNode(int value)
    {
        Node node= new Node(value);
        node.setNext(head);
        head = node;


    }

    public void removeNode()
    {
        if(head!=null) {
            Node removedNode = head;
            head = head.getNext();
            removedNode.setNext(null);
        }

    }
    public void printAllNodes()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.getValue());
            System.out.print("->");
            temp=temp.getNext();
        }
        System.out.print("null");
    }
}
