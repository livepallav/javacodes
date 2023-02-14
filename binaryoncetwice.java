public class binaryoncetwice {
    public static void main(String[] args) {
        int arr[]={2,3,4,3,4,2,6};
        int u=0;
        for (int i = 0; i < arr.length; i++) {
            u=u^arr[i];
        }

        System.out.println(u);
    }
}
