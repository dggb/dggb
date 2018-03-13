package javaTest1_박경호.com.calc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		
		if(num>0 && num<=9 && num2>0 && num<=9){
			System.out.println("합 : " + (num+num2));
			System.out.println("차 : " + (num-num2));
			System.out.println("곱 : " + (num*num2));
			if(num2>0){
			System.out.println("나누기 : 0");
			}else{System.out.println("나누기 : " + (num/num2));
			}
		}else{
			System.out.println("1부터 9까지의 정수만 입력 가능합니다.");
		}
	}
}
