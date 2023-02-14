import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int []arr={5,2,3,6,1,4,7,8};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
//            find max in remaining array and swap with correct index
            int last=arr.length-i-1;
            int maxindex=getmaxindex(arr,0,last);// to swap
            swap(arr,maxindex,last);
        }
    }
    private static int getmaxindex(int[] arr,int start,int end){
        int max=start; //assume max is at start
        for (int i = start; i < end; i++) {
            if (arr[max]<arr[i])
                 max=i;
        }
        return max;
    }
    static void swap (int[] arr,int first,int sec){
        int t=arr[first];
        arr[first]=arr[sec];
        arr[sec]=t;
    }
}
