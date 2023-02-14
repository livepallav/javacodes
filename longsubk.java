public class longsubk {
    public static void main(String[] args) {
        int nums[]={4,1,1,2,3,1,1,1,1,1};
        int k=5;
        int i=0,j=0,sum=0,max=0;
        while(j<nums.length){
            sum+=nums[j];
            if(sum<k) j++;
            else if(sum==k){
                max=Math.max(max,j-i+1);
                j++;
            }
            else if(sum>k){
                while(sum>k){
                    sum-=nums[i];
                    i++;
                }
                j++;
            }
        }
        System.out.println(max);
    }
    
}
