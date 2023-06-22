public class ZeroAtLast {
    public static void ZeroVallAtLast(int []arr,int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        for(int i=count;i<n;i++){
            arr[i]=0;
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        int n=arr.length;
        ZeroVallAtLast(arr,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
