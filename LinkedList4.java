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
public class LinkedList4 {
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
        public  node middle(node head)
        {
            node slow=head;
            node fast=head;
            while(fast!=null&&fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
        public node reverse(node head)
        {
            node curr=head;
            node nextPtr=null;
            node prev=null;
            while(curr!=null)
            {
                nextPtr=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextPtr;
            }
            return prev;
        }
        public boolean palindrome()
        {
            if(head==null)
            return true;

            node mid=middle(head);
            node last=reverse(mid.next);
            node curr=head;
            while(last!=null)
            {
                if(curr.data!=last.data)
                return false;

                last=last.next;
                curr=curr.next;
            }
            return true;
        }
        public void display()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
    }
      public static void main(String[] args) {
        LinkedList4 list4=new LinkedList4();
        list4.insertAtend(1);
        list4.insertAtend(2);
        list4.insertAtend(5);
        list4.insertAtend(2);
        list4.insertAtend(1);
        list4.display();
        System.out.println();

        if(list4.palindrome())
        {
            System.out.println("given linkedlist is palindrome");
        }
        else System.out.println("given linkedlist is not palindrome");


    }
}
