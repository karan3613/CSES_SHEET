import java.util.Scanner;

public class Permutations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        helper(n);
        sc.close();
    }
    public static void helper(int n ){
        if(n == 3 || n == 2)System.out.println("NO SOLUTION");
        else{
            //Have to use this approach as printing every character
            //takes time and would give TLE
            StringBuilder sb = new StringBuilder();
            for(int i = 2 ; i<=n ; i+=2){
                sb.append(i).append(" ");
            }
            for(int i = 1 ; i<=n ; i+=2){
                sb.append(i).append(" ");
            }
            System.out.println(sb.toString());
        }
    }
}
