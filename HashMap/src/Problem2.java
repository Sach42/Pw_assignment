import java.util.HashMap;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            int key = sc.nextInt();
            String value = sc.next();
            map.put(value,key);
        }

        System.out.print(map);

    }
}
