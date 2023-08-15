import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i],1);
        }

        System.out.println(map.lastEntry().getKey());
    }
}
