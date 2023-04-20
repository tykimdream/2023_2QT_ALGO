package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 기타레슨 {
    static int n, m;
    static int[] list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int low = 0;
        int high = 0;

        list = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
            low = Math.max(low, list[i]);
            high += list[i];
        }

        while(low <= high){
            int mid = (low + high) / 2;
            int cnt = 0;
            int sum = 0;
            for(int i = 0; i < n; i++){
                if(sum + list[i] > mid) {
                    sum = 0;
                    cnt++;
                }
                sum += list[i];
            }
            if(sum != 0) cnt++;
            if(cnt > m){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        System.out.println(low);
    }
}
