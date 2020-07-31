package bunki;

import java.util.Scanner;

public class ensyu3_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数A：");
		int 整数A = stdIn.nextInt();

		System.out.println("整数B：");
		int 整数B = stdIn.nextInt();

		if(整数A >= 整数B) {
			int 差 = 整数A - 整数B;
			if(10 >= 差) {
				System.out.println("それらの差は10以下です。");
			} else {
				System.out.println("それらの差は11以上です");
			}
		} else {
			int 差 = 整数B - 整数A;
			if(10 >= 差) {
				System.out.println("それらの差は10以下です。");
			} else {
				System.out.println("それらの差は11以上です");
			}
		}
	}

}
