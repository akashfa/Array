public class MaxAddOne {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max) {
                max = arr[i];

            }
        }
        for(int i=0;i<n;i++){
            if(max==arr[i]){
                arr[i]++;
            }
        }
       for(int i=0;i<n;i++){
           System.out.println(arr[i]+" ");
       }
    }
}
