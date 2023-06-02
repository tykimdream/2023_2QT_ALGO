package Beak;

import java.io.*;
import java.util.*;

public class sliding_2559 {
	static int n, k;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[n];
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int maxV = 0;
		for (int i = 0; i < k; i++) {
			maxV += arr[i];
		}
		int curV = maxV;

		for (int i = k; i < n; i++) {
			// �������� �����ϴ°� ������ �ƴ��� ����
			// ��¥ �ֽ�ȭ �Ҳ���
			curV = curV - arr[i - n] +  arr[i];
			maxV = Math.max(maxV, curV);
		}
		System.out.println(curV);
	}
}
