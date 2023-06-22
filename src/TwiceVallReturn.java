import java.util.HashMap;
public class TwiceVallReturn {
    public static boolean findTwiceVall(int []arr,int n) {
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++){
        int val=arr[i];
        if(map.containsKey(val)){
            return true;
        }else{
            map.put(arr[i],i);
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
