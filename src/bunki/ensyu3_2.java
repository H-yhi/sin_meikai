package bunki;

import java.util.Scanner;

// 整数Aと整数Bの約数を求めるプログラム
class ensyu3_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数A：");
		int 整数A = stdIn.nextInt();

		System.out.println("整数B：");
		int 整数B = stdIn.nextInt();

		if(整数A % 整数B == 0) {
			System.out.println("BはAの約数です。");
		}else {
			System.out.println("BはAの約数ではありません。");
		}
	}

}
