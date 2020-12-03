package insertionsort;
/**@author Muhammad Bilal Iqbal*/
public class insertionsort {
    public static void main(String[]args){
        int A[]={10,4,6,3,9,2};
        int n = A.length ,j, temp;
        for (int i = 0; i < n; i++) {
            temp = A[i];
            j = i-1;
            while ((j > -1) && (A[j] > temp)){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = temp;
        }
        for (int k=1; k<temp;k++ ) {
            System.out.print(k+"");
        }
        System.out.println("");
    }
}
