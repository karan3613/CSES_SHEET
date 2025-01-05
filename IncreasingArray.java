import java.util.* ;

public class IncreasingArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        long[] arr = new long[n];
        for(int i =0 ; i<n ; i++){
           arr[i] = sc.nextInt() ;
        }
        System.out.println(helper(arr));
    }
    public  static long helper(long[] arr){
        long count = 0 ;
        for(int i =1 ; i<arr.length ; i++){
            if(arr[i]>=arr[i-1]) continue;
            else {
                count+=(arr[i-1]-arr[i]);
                arr[i] = arr[i-1];
            }
        }
        return count  ;
    }
}
