package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 게임_1072 {
    static int x, y, z;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y= Integer.parseInt(st.nextToken());
        z = (int)((long)y * 100 /x);
//        System.out.println(z);
        int low = 0;
        int high = (int)1e9;
        int answer = -1;
        int mid = 0;

//        if(x == y){
//            System.out.println(-1);
//            return;
//        }
        while(low <= high){
            mid = (low + high) / 2;
            int curRatio = (int)((((long) y + mid) * 100) / (x + mid));
//            System.out.println("curRatio" + curRatio);
            if(curRatio != z){
//                System.out.println(mid);
//                answer = Math.min(mid, answer);
                answer = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println(answer);

    }
}
