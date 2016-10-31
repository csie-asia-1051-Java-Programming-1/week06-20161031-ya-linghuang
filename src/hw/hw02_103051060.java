package hw;
/*
 * 讓使用者輸入性別與身高，透過函數呼叫，依據男女不同, 幫她(他)計算並輸出其標準體重
 *  ((1)男：(身高-170)*0.6+62 , (2)女：(身高-158)*0.5+52)。
 *  函數算出結果後要回傳至主程式再印出結果。例如:輸入 1 170 則輸出 62.0, 輸入 2 165 則輸出 55.5 
* Date: 2016/10/31
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw02_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		float y =scn.nextFloat();
		float z =fun(y,x);
		System.out.println(z);
	}
	public static float fun(float v1,int type){
		float end = 0;
		if(type==1){
			end =(v1-170)*0.6f+62;
		}
		else if(type==2){
			end=(v1-158)*0.5f+52;
		}
		return end;
	}
	
}
