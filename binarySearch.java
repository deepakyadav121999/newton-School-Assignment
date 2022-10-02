public class binarySearch {
    static int BinarySearch(int arr[],int l, int r,int x){
        if(r>=l){
            int mid = l+(r-l)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]>x){
                 return BinarySearch(arr ,l,mid-1,x);
            }
            else {
               return  BinarySearch(arr,mid+1,r,x);
            }
        }
        return-1;
    }

    public static void main(String[] args) {
        int arr[] = { 5,266,75,44,2,7,8,3};
        int n = arr.length;
        int x = 44;
       int result= BinarySearch( arr,0,n-1,x);
        if(result==-1){
            System.out.println("xxx");
        }
        else {
            System.out.println(BinarySearch(arr, 0, n - 1, x));
        }

    }
}
