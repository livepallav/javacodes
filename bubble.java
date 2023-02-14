import java.util.Arrays;
public class bubble {
    public static void main(String[] args) {
        int[] arr={4,7,2,89,6,4,5,8,9,5,645};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        boolean swap;
//        running n-1 times
        for (int i = 0; i < arr.length; i++) {
            swap=false;
//            for each step max element will come at the last respective index
//            jo last me ja chuka hai uske liye fir se check kerne ki kya jaroorat ...isliye length-i
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                    swap=true;
                }
            }
            if(!swap)// means ager pehli hi baar me swapping nahi hui matlab array sorted hai .. fir aagey baaki 'i' value ke liye sort ker ke koi fayada nahi ...
                // isliye check kiya ki kya pehli baar me swapping hui ager nahi hui to matlab array sorted hai ..
                break;
        }
    }
}
