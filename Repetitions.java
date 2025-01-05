import java.util.* ;
public class Repetitions {
    public  static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(helper(s));
        sc.close();
    }
    public static int helper(String s){
        if(s.length() ==1)return 1 ;
        int max = 0 ;
        int count = 1 ;
        char prev = s.charAt(0);
        for(int i =1 ; i<s.length() ; i++){
            if(s.charAt(i) == prev)count++ ;
            else count = 1 ;
            max = Math.max(max , count);
            prev = s.charAt(i);
        }
        return max ;
    }
}
