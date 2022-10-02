import java.util.*;
public class Nmerge {
    public static void merge(int arr[],int l,int m,int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int L[]= new int[n1];
        int R[]=new int[n2];
        for(int i =l,j=0; i<=m; i++,j++){
            L[j]= arr[i];
        }
        for(int i =m+1,j=0; i<=r; i++,j++){
            R[j]= arr[i];
        }
        int i =0;
        int j =0;
        int k =l;
        while(i<n1 && j<n2){
            if(L[j]<R[j]){
                arr[k++] = L[i++];
            }
            else{
                arr[k++] = R[j++];
            }
        }
        while(i<n1){
            arr[k++] = L[i++];
        }
        while(i<n2){
            arr[k++] =R[j++];
        }
    }

    public static void mergeSort(int arr[],int l ,int r){
        if(l<r){
            int m =(l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int arr[] =new int[a];
        int n = arr.length;
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int l =0;
        int r = n-1;
        mergeSort(arr,l,r);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
