package hw;
/*
 * 請設計一個函數fun(v1, type)，讓使用者輸入一個溫度值及計算方式
 * (type 為1 時 華氏->攝氏，type為2時攝氏->華氏)，
 * 函數算出結果後要回傳至主程式再印出結果。
 * (F=C*9/5+32), (C = (F-32) * (5/9)，例如輸入100 1 則輸出 37.77778; 輸入 37.77778 2 時則輸出 100.0
 * Date: 2016/10/31
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw01_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float y =scn.nextFloat();
		int x = scn.nextInt();
		float z =fun(y,x);
		System.out.println(z);
	}
	public static float fun(float v1,int type){
		float end = 0;
		if(type==1){
			end =(v1-32) * 5/9;
		}
		else if(type==2){
			end=(v1*9/5)+32;
		}
		return end;
	}
}
