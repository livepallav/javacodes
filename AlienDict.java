import java.util.Hashtable;

public class AlienDict {
    public static void main(String[] args) {
        String order="hlabcdefgijkmnopqrstuvwxyz";
        String[] words={"hello","leetcode"};
        
    }
    public boolean isAlienSorted(String[] words, String order) {
        Hashtable<Character,Integer> hs=new Hashtable<>();
        boolean ans=false;
        for(int i=0;i<order.length();i++){
            hs.put(order.charAt(i),i+1);
        }
        int length=words.length;
        int index=0;
        if(length==2){
            for (int i = 0; i < words.length; i++) {
                
            }
            if(hs.get(words[0].charAt(index))==hs.get(words[1].charAt(index))){
                continue;
            }
        }
        return ans;
    }
}
