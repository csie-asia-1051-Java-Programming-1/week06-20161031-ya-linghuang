package ex;
/*
 * Topic: 使用者輸入一個大正整數值，請設計一個函數fun1(n)可以計算該大數字裡的數字總合。例如:輸入: 4832 則輸出 17
 * Date: 2016/10/31
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex05_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long x = scn.nextLong();
		fun1(x);
	}
	public static void fun1(long a){
		long b = 0;
		long c = 0;
		while(a>0){
			b=a%10;
			c=c+b;
			a=a/10;
		}
		System.out.println(c);
	}
}
