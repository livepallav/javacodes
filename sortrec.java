import java.util.ArrayList;
public class sortrec {
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(6);
        ar.add(5);
        ar.add(0);
        ar.add(-1);
        System.out.println(sort(ar));
    }
    public static ArrayList<Integer> sort(ArrayList<Integer> ar){
        if(ar.size()==1)
        return ar;
        int ele=ar.get(ar.size()-1);
        ar.remove(ar.size()-1);
        ar=sort(ar);
        ar=insert(ar,ele);
        return ar;
    }
    public static ArrayList<Integer> insert(ArrayList<Integer> arr,int ele){
        if(arr.size()==0 ){
            arr.add(ele);
            return arr;
        }
        else if(arr.get(0)>=ele){
            arr.add(0,ele);
            return arr;
        }else if(arr.get(arr.size()-1)<=ele){
            arr.add(arr.size(),ele);
            return arr;
        }
        int temp1 =arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        arr = insert(arr,ele);
        arr.add(arr.size(),temp1);
        return arr;
    }
}
