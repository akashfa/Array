public class TargetSum {
    public static int []findIndex(int []arr,int terget) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == terget) {
                    if (arr[i] == terget - arr[j]) {
                        return new int[]{i, j};
                    }
                }
            }
        }
            return null;
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int terget = 9;
//        int arr1[]=new int[2];
        try {

            int arr1[]= findIndex(arr, terget);
            System.out.println(arr1[0] + " " + arr1[1]);
        }catch(Exception e){
            System.out.println("Enter the valid number");
        }

    }
}
