import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class maxsubarray {
    public static void main(String[] args) {
        String s="forxxorfxdorf";
        String p="for";
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0,j=0;
        int k=p.length();
        for(int x=0;x<k;x++){
            char ch=p.charAt(x);
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        int count=map.size();
        int ans=0;
        int strSize=s.length();
        while(j<strSize){
            char jth=s.charAt(j);
            if(map.containsKey(jth)){
                map.put(jth,map.get(jth)-1);
                if(map.get(jth)==0){
                    count--;
                }
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(count==0) 
                ans++;
                char ch1=s.charAt(i);
                if(map.containsKey(ch1)){
                    map.put(ch1,map.get(ch1)+1);
                    if(map.get(ch1)==1)
                    count++;
                }
                i++;
                j++;
            }
        }
        System.out.println(ans);
	}
}
