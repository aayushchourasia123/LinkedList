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
  
public class LinkedList3 {
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
    public void duplicat()
    {
        node slow=head;
        node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            
            fast=fast.next;
            if(slow.data==fast.data)
            {
                slow.next=fast.next;
                fast=fast.next;
            }
            slow=slow.next;
        }

    }
    public void sort()
    {
        node temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
       
        for(int i=0;i<c-1;i++)
        {
            node slow=head;
            node fast=slow.next;
            for(int j=0;j<c-i-1;j++)
            {
                if(fast!=null&&slow.data>fast.data)
                {
                    int d=slow.data;
                    slow.data=fast.data;
                    fast.data=d;
                }
                slow=fast;
                if(fast!=null){
                fast=fast.next;
            }
            }
            
        }

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
        
    {
        LinkedList3 list1=new LinkedList3();
        list1.insertAtend(5);
        list1.insertAtend(5);
        list1.insertAtend(5);
        list1.insertAtend(60);
        list1.insertAtend(50);
        list1.insertAtend(7);
        list1.insertAtend(13);
        list1.insertAtend(14);
        list1.insertAtend(20);
        list1.insertAtend(20);
        list1.display();
        System.out.println();

        
        System.out.println();
        list1.sort();
        list1.duplicat();
        list1.display();
    }
}
}
