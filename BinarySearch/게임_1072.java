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
        z = (y * 100) /(x);
//        System.out.println(z);
        int low = 1;
        int high = 1000000000;
        int answer = 1000000000;
        int mid = 0;

        int last = z;
        while(low <= high){
            mid = (low + high) / 2;
            int curRatio = ((y+mid) * 100) / (x + mid);
//            if(z != curRatio){
//                System.out.println(1);
//            }
//            System.out.println("curRatio" + curRatio);
            if(curRatio != z){
//                System.out.println(mid);
                last = curRatio;
                answer = Math.min(mid, answer);
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        if(last == z){
            System.out.println(-1);
        } else
        System.out.println(answer);

    }
}
