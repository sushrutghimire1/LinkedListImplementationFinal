import org.junit.jupiter.api.Test;



public class LinkedListTest {

    @Test
    void EmptyList()
    {
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.printAllNodes();
    }

    @Test
    void addFirstNode()
    {
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.insertNode(1);
        linkedList.printAllNodes();
    }

    @Test
    public void addMoreThanTwoNodes()
    {
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.printAllNodes();
    }

    @Test
    public void removeFirstNode()
    {
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.removeNode();
        linkedList.printAllNodes();
    }
    @Test
    public void removeForMoreThanOneNodes()
    {
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.removeNode();
        linkedList.printAllNodes();
    }

}
