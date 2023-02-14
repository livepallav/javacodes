public class linearseach {
    public static void main(String[] args) {
        int num[]={2,65,449,65,2,494,94,95,965,26};
        int target=20;
        System.out.println(search(num,target));
    }
    static int search(int arr[], int target){
        if(arr.length==0)
            return -1;
        for (int i = 0; i < arr.length; i++) {
             if(arr[i]== target)
                 return  i;
        }
        //if it is not found then return -1
        return -1;
    }
}
