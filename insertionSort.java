public class insertionSort {
//    public static void printArray(int[] arr){
//        for(int i=0; i<arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//    }
    public static void main(String[] args) {
        int[] arr ={7,3,8,2,1};
        int n = arr.length;
        for(int i=1; i<n; i++){
            int key = arr[i];
           int j = i-1;
                while ( j >=0   && key < arr[j]){
                    arr[j+1] = arr[j];
                    j--;
            }
             arr[j+1] = key;
        }
       // printArray(arr) ;
       for(int i=0; i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
        System.out.println();
    }
}
