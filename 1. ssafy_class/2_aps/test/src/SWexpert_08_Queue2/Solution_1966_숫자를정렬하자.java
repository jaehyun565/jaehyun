package SWexpert_08_Queue2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_1966_숫자를정렬하자 {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int testCase = 1; testCase <= T; testCase++) {
			int N = Integer.parseInt(br.readLine());

			String s[] = br.readLine().split(" ");
			int[] data = new int[s.length];
			for (int i = 0; i < s.length; i++) {
				data[i] = Integer.parseInt(s[i]);
			}

			for (int i = 1; i < data.length; i++) {
				int key = data[i];
				int j;
				for (j = i - 1; j >= 0; j--) {
					if (key >= data[j]) {
						break;
					}
					data[j + 1] = data[j];
				}
				data[j + 1] = key;
			}
			bw.write("#"+testCase+" ");
			for(int i : data) {
				bw.write(i+" ");
			}
			bw.write("\n");
		}
		bw.close();
	}
}
