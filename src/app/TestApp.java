package app;

import java.util.Scanner;

public class TestApp {
	
		public static void main(String[] args) {
			// 步驟1: 宣告Scanner
			Scanner scanner = new Scanner(System.in);

			// 步驟2: 讀入整數
			int n = scanner.nextInt();
			// 步驟3: 不再使用時需關閉
			scanner.close();
			int sum = 0;
			for (int i = 1; i <= n; i++) {

				if (i % 3 == 0 || i % 4 == 0) {
					sum += i; 

				}

			}
			System.out.println(sum);
		}

	}

