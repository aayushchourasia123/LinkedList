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
public class LinkedList5 {
    node head1,head2;
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
        
        public node twosum(node head1,node head2)
        {
            node t1=head1;
            node t2=head2;
            t1=reverse(t1);
            t2=reverse(t2);
            node dummy=new node(0);
            node curr=dummy;
            int carry=0;
            while(t1!=null||t2!=null)
            {
                int sum=carry;
                if(t1!=null) sum=sum+t1.data;
                if(t2!=null)sum=sum+t2.data;
                node newNode=new node(sum%10);
                carry=sum/10;
                curr.next=newNode;
                curr=curr.next;
                if(t1!=null) t1=t1.next;
                if(t2!=null) t2=t2.next;
             }
             if(carry!=0) 
             {
                node newNode=new node(carry);
                curr.next=newNode;
            }
             return reverse(dummy.next);
        }

        public void display(node head)
        {
            node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data +" ");
                temp=temp.next;
            }
        }
    public static void main(String[] args) {
        
        LinkedList5 list=new LinkedList5();
        list.head1 = new node(7);
        list.head1.next = new node(5);
        list.head1.next.next = new node(9);
        list.head1.next.next.next = new node(4);
        list.head1.next.next.next.next = new node(6);
        System.out.print("First List is ");
        list.display(list.head1);
        System.out.println();

        // creating second list
        list.head2 = new node(8);
        list.head2.next = new node(4);
        System.out.print("Second List is ");
        list.display(list.head2);
        System.out.println();
        System.out.print("resultant ");
        node sum=list.twosum(list.head1, list.head2);
        list.display(sum);

    }
}
