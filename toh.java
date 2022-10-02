import java.util.*;
public class toh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toh(n,"A","B","C");
    }
    static void toh(int n,String src,String des,String helper){
        if(n==0){

            return;
        }
        toh(n-1,src,helper,des);
        System.out.println(n+":"+src+"->"+des);
        toh(n-1,helper,des,src);
        return;
    }
}
