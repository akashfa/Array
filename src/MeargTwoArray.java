
import java.util.Arrays;
public class MeargTwoArray {
    public static void meargArray(int[]num1,int m,int[]num2,int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
//        int arr[] =new int[k];
        while(i>=0&&j>=0){
            if(num1[i]>=num2[j]){
               num1[k]=num2[i];

                i--;
            }else {

                num1[k] = num2[j];
                j--;
            }
            k--;
        }
      while(j>=0){
          num1[k]=num2[j];
          k--;
          j--;
      }

        while(i>=0){
            num1[k]=num2[i];
            k--;
            i--;
        }


    }
    public static void main(String[] args) {
        int num1[]={1,2,3,0,0,0};
        int m=3;
        int num2[]={2,5,6};
        int n=3;

           meargArray(num1, m, num2, n);
        for(int k=1;k<=num1.length;k++){
            System.out.println(k+" ");
        }
          }
    }

