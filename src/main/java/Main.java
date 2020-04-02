import java.util.Scanner;

/**
 * @Author: vvshuai
 * @Description:
 * @Date: Created in 14:25 2020/4/2
 * @Modified By:
 */
public class Main {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n; i++){
            arr[i] = in.nextInt();
        }
        solve(n, arr);
    }

    public static int solve(int n, int[] arr){
        if(n<=0){
            return 0;
        }
        int cur = 0;
        int Max = 0;
        for(int i = 0;i < n; i++){
            cur += arr[i];
            if(cur > Max){
                Max = cur;
            }
            if(cur < 0){
                cur = 0;
            }
        }
        return Max;
    }
}
