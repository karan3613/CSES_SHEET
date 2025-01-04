import java.util.* ;
import java.util.Scanner; 

class WeirdAlgorithm {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       print(n) ;
    }
    public static void print(int n){
       if(n==1){
        System.out.print(n);
        return ;
       } 
       System.out.print(n);
       System.out.print("->"); 
       if(n%2==0)print(n/2);
       else print(n*3 + 1);
    }
}