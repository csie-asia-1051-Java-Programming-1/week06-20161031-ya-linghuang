package ex;
/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex04_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String x = scn.next();
		square(x);
	}
	public static void square(String a){
		char b [] = a.toCharArray();
		for(int i = 0 ; i<b.length ; i++){
			int z = b[i]-48;                                 //字元數字轉數字
			System.out.print((int)Math.pow(z, 2)+" ");
		}
	}
}
