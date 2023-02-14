import java.util.ArrayList;
import java.util.Stack;

public class ngl {
    public static void main(String[] args) {
        int[]ar={1,3,0,0,1,2,4};
        Stack<Integer> s=new Stack<>();
        ArrayList<Integer> a= new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            if(s.empty()) a.add(-1);
            else if(s.peek()>ar[i]&&s.size()>0) a.add(s.peek());
            else if(s.peek()<=ar[i]&&s.size()>0){
                while(s.size()>0&&s.peek()<=ar[i]){
                    s.pop();
                }
                if(s.empty()) a.add(-1);
                else a.add(s.peek());
            }
            s.push(ar[i]);
        }
        for(int i=0;i<a.size();i++) System.out.print(a.get(i)+" ");
    }
}
