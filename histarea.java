import java.util.HashMap;
import java.util.Stack;
public class histarea {
    public static void main(String[] args) {
        int min=Integer.MIN_VALUE;
        int []arr={6,2,5,4,5,1,6};
        int pseudoid=-1;
        Stack<Integer> s=new Stack<>();
        HashMap<Integer,Integer> nslid=new HashMap<>();
        HashMap<Integer,Integer> nsrid=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(s.empty()){
                nslid.put(arr[i],pseudoid);
            }
            else if(s.size()>0&&s.peek()<arr[i]) nslid.put(arr[i],s.peek());
            else if(s.size()>0&&s.peek()>arr[i]){
                while(s.size()>0&&s.peek()>arr[i]) s.pop();
                if(s.empty()){
                    nslid.put(arr[i],pseudoid);
                }
                else nslid.put(arr[i],s.peek());
            }
            s.push(arr[i]);
        }
        System.out.println(nslid.get(arr[2]));
        for(int i=0;i<=nslid.size()+1;i++){
            System.out.print(arr[i]+" -> "+nslid.get(arr[i])+" ,");
        }
    }    
}
