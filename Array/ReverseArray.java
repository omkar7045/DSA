//Space-optimized iterative method(Two Pointer)

package Array;

public class ReverseArray {
    public static void printArray(int arr[], int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverseArray(int arr[], int n){
        int p = 0;
        int q = n-1;
        while(p < q){
            int temp = arr[p];
            arr[p] = arr[q];
            arr[q] = temp;
            p++;
            q--;
        }
        printArray(arr, n);

    }

    public static void main(String[] args){
        int n = 5;
        int arr[] = {5,4,3,2,1};
        reverseArray(arr, n);
    }
}
