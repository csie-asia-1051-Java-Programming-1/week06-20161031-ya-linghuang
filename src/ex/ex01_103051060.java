package ex;
/*
 * Topic: 寫一函數 square(n,c)，以 c 字元，印出邊長為 n 之實心正方形。Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex01_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("先輸入邊長，再輸入符號，將印出圖形: ");
		int x = scn.nextInt();
		char y = scn.next().charAt(0);
		square(x,y);
	}
	public static void square(int n,char c){
		for(int i=1 ; i<=n ; i++){
			for(int j=1 ; j<=n ; j++){
				System.out.print(c);
			}
		System.out.print("\n");
		}
	}
}
