class node
{
    int data;
    node next;
    node(int d)
    {
         data=d;
         next=null;
    }
}
public class LinkedList1
{
    node head;
    public void insertAtend(int newData)
    {
        node newNode=new node(newData);
        if(head==null)
        {
            head=newNode;
            return;
        }
        node temp=head;
        newNode.next=null;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        return;
    }
    public boolean searchData(int a)
    {
        node temp=head;
        while(temp!=null)
        {
            if(temp.data==a)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedList1 list1=new LinkedList1();
        list1.insertAtend(5);
        list1.insertAtend(7);
        list1.insertAtend(50);
        list1.insertAtend(760);
        list1.insertAtend(12);
        list1.insertAtend(13);

        if(list1.searchData(13))
        {
            System.out.println("present");
        }
        else System.out.println("not present");



    }
}
