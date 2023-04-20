package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cakeCut {
    static int n, m, l;
    static int[] toCut;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        toCut = new int[m + 1];

        for(int i =0; i <m;i++){
            st = new StringTokenizer(br.readLine());
            toCut[i] = Integer.parseInt(st.nextToken());
        }
        toCut[m] = l;

        for(int i =0; i <n;i++){
            int answer = 0;
            int q = Integer.parseInt(br.readLine());
            int low = 0;
            int high = l;
            while(low <= high){
                int mid = (high+low)/2;
                if(possible(mid, q)){
                    answer = Math.max(answer, mid);
                    low = mid + 1;
                }else {
                    high = mid-1;
                }
            }
            System.out.println(answer);
        }
        return;
    }

    public static boolean possible(int mid, int q){
        int cutCnt = 0;
        int prev = 0;
        for(int i =0; i <= m; i++){
            if(toCut[i] - prev >= mid){
                prev = toCut[i];
                q--;
            }
        }

        // 지금 크기로 잘랐는데 q를 만족하지 못하는 경우 크기를 더 줄여봐야한다.
        return q < 0? true : false;
    }
}
