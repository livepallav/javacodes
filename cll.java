public class cll {
    private class node{
        int val;
        node next;

        public node(int val) {
            this.val = val;
        }
    }
    private node head;
    private node tail;

    public cll() {
        this.head = null;
        this.tail = null;
    }




    public void  insert(int val){
        node n=new node(val);
        if(head==null){
            head=n;
            tail=n;
            return;
        }
        tail.next=n;
        n.next=head;
        tail=n;
    }




    public void display(){
        node t=head;
        if(head!=null){
            do{
                System.out.print(t.val+"->");
                t=t.next;
            }while(t!=head);
            System.out.println("head");
//            we can also print till tail... like
//            while node is != tail..
        }
    }



    public void delete(int val){
        node t=head;
        if(t==null)
            return;
        if(t.val==val){
            head=head.next;
            tail.next=head;
        return;
        }
        do{
            node n=t.next;
            if(n.val==val){
                t.next=n.next;
                break;
            }
            t=t.next;
        }while(t!=head);
    }
}
