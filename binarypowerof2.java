public class binarypowerof2 {
    public static void main(String[] args) {
        int n=25;
        boolean ans=(n&(n-1))==0;
        System.out.println(ans);
    }
}
