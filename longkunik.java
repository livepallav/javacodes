import java.util.HashMap;

public class longkunik {
    public static void main(String[] args) {
        String s="aabacbebebe";
        int k=3;
        int i=0,j=0; int max=Integer.MIN_VALUE;
        HashMap<Character,Integer> map= new HashMap<>();
        while(j<s.length()){
            char ch=s.charAt(j);
            
            if(map.size()<k)
            j++;
            else if(map.size()==k){
                max=Math.max(max,j-i+1);
                j++;
            }
            else if(map.size()>k){
                while(map.size()>k){
                    
                    if()

                    i++;
                }
                j++;
            }
        }
        System.out.println(max);
    }
}
