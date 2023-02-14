import java.util.ArrayList;
import java.util.Scanner;

public class jlearn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter window size");
        int k = sc.nextInt();
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (j < size) {
            if (arr[j] < 0) {
                list.add(arr[j]);
            }
            if (j - i + 1 < k)
                j++;
            else if (j - i + 1 == k) {
                if (list.isEmpty())
                    System.out.print(0+" ");
                else {
                    System.out.print(list.get(0)+" ");
                    if (arr[i] == list.get(0))
                        list.remove(0);
                }
                i++;
                j++;
            }
        }
    }
}