package linearsearch;
/**
 *
 * @author Muhammad Bilal Iqbal
 */
public class linearsearch {
    public static void main(String[]args){
        int A[]={5,8,4,10,3,1};
        int n = A.length, x = 8 ,i ;
        for ( i = 0; i < n; i++) {
            if(A[i] == x) {
                System.out.println("Element is present at index" + i );
                break;
            }
            if (i == n){
                System.out.println("Element is no present in array.");
            } 
        }
        
    }
}
