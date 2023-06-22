public class TwiceValue {
    public static boolean findTwiceVall(int []arr,int n){
        boolean flage=false;
        for(int i=0;i<n-i;i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {

                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        int n=arr.length;
       System.out.println( findTwiceVall(arr,n));
    }
}
