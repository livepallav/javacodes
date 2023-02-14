import java.util.ArrayList;
import java.util.Stack;

public class ngr {
    public static void main(String[] args) {
        int []arr={1,3,0,0,1,2,4};
        Stack<Integer> s=new Stack<>();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(s.empty()) a.add(-1);
            else if(s.size()>0&&s.peek()>arr[i]) a.add(s.peek());
            else if(s.size()>0&&s.peek()<=arr[i]){
                while(s.size()>0&&s.peek()<=arr[i]){
                    s.pop();
                }
                if(s.empty()) a.add(-1);
                else a.add(s.peek());
            }
            s.push(arr[i]);
        }
        for(int i=a.size()-1;i>=0;i--){
            System.out.print(a.get(i)+" ");
        }
    }
    
}
