public class binarysearch {
    public static void main(String[] args) {
        int []arr={-1,0,3,5,9,12};
        int target = 9;
        System.out.println(bs(arr,target));
    }
//    return the index
    static int bs(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
//           int mid=(start+end)/2;
//           if we take a very large number for
//           start and end then it might be possible
//           that the start+end may exceed the range
//           of integer hence it may give an error
//           so for this
            int mid=start+(end-start)/2;
            System.out.println(mid);
            if(mid==target)
                return mid;
            if(target<mid)
                end=mid-1;
            else if(target>mid)
                start=mid+1;
//            these conditions change if the array is
//             sorted in decending order
        }
        return -1;
    }
}
