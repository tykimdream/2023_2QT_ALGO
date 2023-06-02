package Beak;

import java.io.*;
import java.util.*;

public class sliding_2559 {
	static int n, k;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
//			arr[i] = 1;
		}

		int maxV = 0;
		for (int i = 0; i < k; i++) {
			maxV += arr[i];
		}
		int curV = maxV;

		for (int i = k; i < n; i++) {
			// 다음날로 진행하는게 좋은지 아닌지 보고
			// 날짜 최신화 할꺼임
			curV = curV - arr[i - k] +  arr[i];
			maxV = Math.max(maxV, curV);
//			System.out.println(maxV);
		}
		System.out.println(maxV);
	}
}
