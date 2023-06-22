import java.util.HashMap;
public class TergetSum1 {
    public static int [] findIndex(int []arr,int terget){
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=terget-arr[i];
            if(map.containsKey(num)){
                return new int[]{map.get(num),i};
            }else{
                map.put(arr[i],i);
            }
        }

        return null;
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int terget=9;
        try {

            int arr1[]= findIndex(arr, terget);
            System.out.println(arr1[0] + " " + arr1[1]);
        }catch(Exception e){
            System.out.println("Enter the valid number");
        }
    }
}
