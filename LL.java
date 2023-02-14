public class LL {
    private class node{
        private int value;
        private node next;

        public node(int value) {
            this.value = value;
        }

        public node(int value, node next) {
            this.value = value;
            this.next = next;
        }
    }




    private node head;
    private node tail;
//    why take tail? if we want to insert at last, we can do it in constant time
    private int size;
    public LL(){
        this.size=0;
    }




//    insert node at beginning
    public void insertAtFirst(int val){
        node n=new node(val);
        n.next=head;
        head=n;
        if(tail==null)
            tail=head;
        size++;
    }




//    insert at last
    public void insertatlast(int val){
        node n=new node(val);
        if(tail==null){
            insertAtFirst(val);
            return;
        }
        tail.next=n;
        tail=n;
        size++;
    }




//    insert at an index
    public void insertatpos(int val,int index){
        if(index==0){
            insertAtFirst(val);
            return;
        }
        if(index==size){
            insertatlast(val);
            return;
        }
        node temp=head;
//        starting from coz 0 to ye line 68 me jo
//        hai vo hai hi.. uske baad se jump kerna hai na
        for (int i = 1; i <index; i++) {
            temp=temp.next;
        }
        node n=new node(val,temp.next);
        temp.next=n;
        size++;
    }




//    delete first element
    public int deletefirst(){
//      return type int coz it will return the
//      element that has been deleted .. if you
//      dont want to return the value ..let it be void
        int val=head.value;
        head=head.next;
        if(head==null)
            tail=null;
        size--;
        return val;
    }




//    delete last item

//    to get the reference of the node
    public node getnode(int index){
        node n=head;
        for (int i = 0; i < index; i++) {
            n=n.next;
        }
        return n;
    }



//    now function of delete last element
    public int deletelast(){
        if(size<=1)
            return deletefirst();
        node sl=getnode(size-2);
        int val=tail.value;
        tail=sl;
        tail.next=null;
        return val;
    }
//    here the problem is that we have traversed
//    the whole ll so the complexity is o(n)




    public int deleteatindex(int index){
        if(index==0)
            return deletefirst();
        if(index==size-1)
            return deletelast();
        node prev= getnode(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;
    }



//    to find a node for qa particular value...
//    we can find the node if we are given a value
    public node findnode(int valu){
        node n=head;
        while(n!=null){
            if(n.value==valu)
                return n;
            n=n.next;
        }
        return null;// if nothing is found then return null
    }




//    display ll
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("end");
    }

}
