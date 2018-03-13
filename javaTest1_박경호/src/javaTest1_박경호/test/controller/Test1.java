package javaTest1_박경호.test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		if(num<=100 && num>0){
		if(num%2==0){
			System.out.println("2의 배수 입니다.");
		}else if(num%2==1){
			System.out.println("2의 배수가 아닙니다.");
		}
		}else{
			System.out.println("1~100 까지의 정수만 입력이 가능합니다.");
		}
	}

}
