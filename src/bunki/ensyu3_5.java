package bunki;

import java.util.Scanner;

public class ensyu3_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("正の値：");
		int 整数値 = stdIn.nextInt();

		if(整数値 < 0) {
			System.out.println("正ではない値が入力されました。");
		} else if(整数値 % 5 == 0) {
			System.out.println("その値は5で割り切れます");
		} else {
			System.out.println("その値は5では割り切れません");
		}
	}

}
