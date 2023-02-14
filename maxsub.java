import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
public class maxsub {
    public static void main(String[] args) {
        int ar[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        Deque<Integer> dq=new LinkedList<>();
        ArrayList<Integer> ans =new ArrayList<>();
        int i=0,j=0;
        while(j<ar.length){
            if(dq.size()==0) dq.add(ar[j]);
            else{
                while(dq.size()>0&&dq.peek()<ar[j])
                dq.removeLast();
                dq.add(ar[j]);
            }
            if(j-i+1<k) j++;
            else if(j-i+1==k){
                ans.add(dq.peek());
                if(ar[i]==dq.peek()) dq.removeFirst();
                i++;j++;
            }
        }
        for (int j2 = 0; j2 < ans.size(); j2++) {
            System.out.print(ans.get(j2)+" ");
        }
    }
}
