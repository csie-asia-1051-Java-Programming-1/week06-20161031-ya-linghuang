package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex02_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入兩個正整數，將輸出排列組合函數C(m,n): ");
		int x = scn.nextInt();
		int y = scn.nextInt();
		System.out.print("答案為: "+CC(x,y));
	}
	public static int C (int n){
		int sum = 1;
		for(int i=1 ; i<=n ; i++){
			sum = sum*i;
		}
		return sum;
	}
	public static float CC(int m,int n){
		float k = (float)(C(m)*1.0/C(n)*C(m-n)*1.0);
		return k;
	}

}
