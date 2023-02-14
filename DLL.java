public class DLL {
    private class node{
        int value;
        node next;
        node prev;

        public node(int value) {
            this.value = value;
        }

        public node(int value, node next, node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    node head;


//    insert at he beginnign
    public void insertfirst(int val){
        node n=new node(val);
        n.next=head;
        n.prev=null;
        if(head!=null)//if this is the first node we are inserting
            head.prev=n;
        head=n;
    }



//    insert at last
    public void insertlast(int val){
        node n=new node(val);
        node h=head;

        if(head==null){
            n.prev=null;
            head=n;
        }
        while(h.next!=null) {
            h = h.next;
        }
        n.next=null;
        h.next=n;
        n.prev=h;
    }



//    insert at particular index
//    ikdam same insertatpos func in sll ..
//    but isme ek change ye ker sakte hai ...
//    insert a node after a node... the
//    integer value will be given of the node
    public void insertafternode(int after,int val){
        node p=findnode(after);
        if(p==null)
            System.out.println("not exist");
        node n=new node(val);
        n.next=p.next;
        p.next=n;
        n.prev=p;
        if(p.next!=null)
            p.next.prev=n;
    }



    public node findnode(int valu){
        node n=head;
        while(n!=null){
            if(n.value==valu)
                return n;
            n=n.next;
        }
        return null;// if nothing is found then return null
    }




//    to display
    public void display(){
        node n=head;
        node last=null;// we will use this to display from last
        while(n!=null){
            System.out.print(n.value+"->");
            last=n;// we will use this to display from last
            n=n.next;
        }
        System.out.println("end");


//        display in reverse
        System.out.println("in reverse");
        while(last!=null){
            System.out.print(last.value+"->");
            last=last.prev;
        }
        System.out.println("start");
    }
}

