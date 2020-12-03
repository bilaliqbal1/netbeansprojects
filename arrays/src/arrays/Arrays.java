package arrays;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a[] = {9,8,5,4,3};
        int b;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    b=a[i];
                    a[i]=a[j];
                    a[j]=b;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
            }
                
    }
    
}
