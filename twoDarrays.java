import java.util.*;
public class twoDarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int [n][m];
        //input
        for (int i=0; i<n;i++){
                for(int j=0; j<m; j++) {
                    arr[i][j] = sc.nextInt();
                }
        }
        int x = sc.nextInt();
        //output
        for (int i=0; i<n;i++){
            for(int j=0; j<m; j++) {
               // System.out.print(arr[i][j]+" ");
                if(arr[i][j]==x){
                    System.out.println("("+i+","+j+")");
                }

            }
            //System.out.println();
        }

    }
}
