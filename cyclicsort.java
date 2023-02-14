import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr={5,4,8,1,2,6,7,9,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
//     start looping from i, put it at the correct index, only put i in the beginning when i at the correct index..
//    check swap move check swap move check swap bas yahi kerna hai
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            //check wheter this is at the correct index or not
            int correct= arr[i]-1;
            if(arr[i]!=arr[correct])
                swap(arr,i,correct);
            else i++;
        }
    }
    static void swap (int[] arr,int first,int sec){
        int t=arr[first];
        arr[first]=arr[sec];
        arr[sec]=t;
    }
}
