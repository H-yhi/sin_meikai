package bunki;
import java.util.Scanner;

// 絶対値を求めるプログラム
public class Positive {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数値：");
		int n = stdIn.nextInt();

		int a = Math.abs(n);
		System.out.println("その絶対値は" + a + "です");
	}

}
