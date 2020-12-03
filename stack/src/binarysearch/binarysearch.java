package binarysearch;
/**
 *
 * @author Muhammad Bilal Iqbal
 */
public class binarysearch {
    public static void main(String[]args){
        int A[]={5,8,4,10,3,1};
        int n = A.length, x = 4 ,lb=0, ub=n-1 ;
        int mid = (ub+lb)/2;
        while(lb <= ub){
            if (A[mid] == x) {
                System.out.println("Element at index " + mid);
                break;
            }
            else{
                if(A[mid]<x){
                    lb = mid+1;
                }
                else{
                    ub = mid-1;
                }
            }
        }
    }
}
