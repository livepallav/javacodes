import java.util.Arrays;
public class insertionsort {
    public static void main(String[] args) {
        int[] arr={18, -9,84,-96,4,69,-97,4};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1])
                    swap(arr,j,j-1);
                else
                    break;
            }
        }
    }
    static void swap (int[] arr,int first,int sec){
        int t=arr[first];
        arr[first]=arr[sec];
        arr[sec]=t;
    }
}
