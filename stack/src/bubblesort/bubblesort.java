package bubblesort;
/**
 *
 * @author Muhammad Bilal Iqbal
 */
public class bubblesort {
    public static void main(String[]args){
        int A[]={5,8,4,10,3,1};
        int n = A.length, temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (A[j] > A[j+1]) {
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        System.out.println("Array Sorted");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "");
        }
        System.out.println("");
    }
}
