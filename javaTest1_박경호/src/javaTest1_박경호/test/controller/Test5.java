package javaTest1_박경호.test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		int num3 = 0;
		if(num>0 && num<=9 && num2>0 && num<=9){
			num3 = num*num2;
			if(num3>10){
				System.out.println("두자리 수 입니다.");
			}else{
				System.out.println("한자리 수 입니다.");
			}
		}
	}

}
