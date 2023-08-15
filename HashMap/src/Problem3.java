import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(isDuplicate(arr));
    }

    private static boolean isDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            if(set.contains(ele)){
                return true;
            }
            set.add(ele);
        }
        return  false;
    }
}
