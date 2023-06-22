import java.util.HashMap;
public class RemoveOccurences {
    public static int[]removeAllOccurences(int []arr,int val){
        int n=arr.length;

        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=val){
                count++;
            }
        }
        int result[]=new int[count];
        int index=0;
        for(int num:arr){
            if(num!=val){
                result[index]=num;
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={3,2,2,3};
        int val=2;
        boolean flage=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                flage=true;
                break;
            }
        }
       if(flage==true) {
           int arr1[] = removeAllOccurences(arr, val);
           for (int num : arr1) {
               System.out.println(num + " ");
           }
       }else{
           System.out.println("Enter the vali number");
       }
}


    }





