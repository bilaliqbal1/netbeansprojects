package selectionsort;
/**@author Muhammad Bilal Iqbal*/
public class selectionsort {
    public static void main(String[]args){
        int A[]={10,4,6,3,9,2};
        int n = A.length , min , temp;
        for (int i = 0; i < n-1; i++) {
            min = i;
            for (int j = i+1; j < n; j++) {
                if (A[j] < A[min]) {
                    min =j;
                }
            }
                temp = A[min];
                A[min] = A[i];
                A[i] = temp;
        }
        System.out.println("Sorted Array");
        for (int i = 0; i < n; ++i) {
            System.out.print(A[i]+ " ");
        }
        System.out.println("");   
    }
}
