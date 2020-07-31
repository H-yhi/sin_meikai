package bunki;

import java.util.Scanner;

public class ensyu3_6 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数値：");
		int 整数値 = stdIn.nextInt();

		if(整数値 < 0) {
			System.out.println("正でない値が入力されました。");
		} else if(整数値 % 10 == 0) {
			System.out.println("その値は10の倍数です。");
		} else {
			System.out.println("その値は10の倍数ではありません。");
		}
	}
}
