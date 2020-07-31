package bunki;

import java.util.Scanner;

public class ensyu3_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数A："); int a = stdIn.nextInt();
		System.out.println("整数B："); int b = stdIn.nextInt();
		System.out.println("整数C："); int c = stdIn.nextInt();

		//med(a, b, c);
		System.out.println("中央値：" + med(a, b, c));
	}
	 //3つの整数値の中央値を求めるメソッド
    static int med(int a, int b, int c) {
    	if(a >= b) {
    		if(b >= c) {
    			return b;
    		}
    		else if(a <= c) {
    			return a;
    		}
    		else {
    			return c;
    		}
    	}
    	else if(a > c) {
    		return a;
    	}
    	else if(b > c) {
    		return c;
    	}
    	else {
    		return b;
    	}
    }

}
