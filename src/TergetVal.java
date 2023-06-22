public class TergetVal {
    public static int  findIndex(int []arr,int terget){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==terget){
                return mid;
            }else if(arr[mid]<terget){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {1,3,5,6};
        int terget = 5;
       int val= findIndex(arr,terget);
       System.out.println("index: "+val+" ");
    }
}
