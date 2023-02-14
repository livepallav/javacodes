import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class nsr {
    public static void main(String[] args) {
        int[]ar={2,5,8,2,6,3,1,5,9,7,6};
        Stack<Integer> s=new Stack<>();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            if(s.empty()) a.add(-1);
            else if(s.size()>0&&s.peek()<ar[i]) a.add(s.peek());
            else if(s.size()>0&&s.peek()>ar[i]){
                while(s.size()>0&&s.peek()>=ar[i]) s.pop();
                if(s.empty()) a.add(-1);
                else a.add(s.peek());
            }
            s.push(ar[i]);
        }
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
    }
}
