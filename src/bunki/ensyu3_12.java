package bunki;

import java.util.Scanner;

public class ensyu3_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数A："); int a = stdIn.nextInt();
		System.out.println("整数B："); int b = stdIn.nextInt();
		System.out.println("整数C："); int c = stdIn.nextInt();

		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		System.out.println("最小値は" + min + "です。");

	}

}
