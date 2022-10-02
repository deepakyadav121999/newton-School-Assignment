import java.util.*;

public class QuickSort {
      public static int partition(int arr1[],int l, int r){
            int pivot =arr1[l];
            int i = l+1;
            int j = r;
            int temp;
            do {
                while ( i<=r && arr1[i] <= pivot) {
                    i++;
                }
                while (j >=l && arr1[j] >= pivot )  {
                    j--;
                }
                if(i<j){
                    temp =arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }while(i<j);
            temp = arr1[l];
            arr1[l] = arr1[j];
            arr1[j] = temp;
            return j;

      }
      public static void quickSort(int arr1[],int l, int r) {
         int partIndex;
          if (l < r) {
              partIndex = partition(arr1, l, r);

              quickSort(arr1, l, partIndex - 1);
              quickSort(arr1, partIndex + 1, r);
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
            int r =n-1;
            quickSort(arr,0,n-1);
            for(int i=0; i<n; i++)
                System.out.print(arr[i]+" ");

        }
}
