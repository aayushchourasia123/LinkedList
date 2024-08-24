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
public class LinkedList2 {
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
    public void insertAtIdx(int idx,int data)
    {
        node newNode=new node(data);
        node temp=head;
        if(idx==0)
        {
            newNode.next=head;
            head=newNode;

        }
        for(int i=1;i<=idx-1;i++)
        {
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void display()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList2 list1=new LinkedList2();
        list1.insertAtend(5);
        list1.insertAtend(7);
        list1.insertAtend(50);
        list1.insertAtend(760);
        list1.insertAtend(12);
        list1.insertAtend(13);
        list1.display();
        System.out.println();
        list1.insertAtIdx(6,10);
        list1.display();
}
}
