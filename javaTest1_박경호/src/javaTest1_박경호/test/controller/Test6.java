package javaTest1_박경호.test.controller;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~5 까지 입력 : ");
		char num = sc.next().charAt(0);
	
		if(num>0 || num<6){
		switch(num){
		case '1':
			System.out.println("1 : ** 입력이 정상적으로 되었습니다! **");
			break;
		case '2':
			System.out.println("2 : ** 조회가 시작되었습니다! **");
			break;
		case '3':
			System.out.println("3 : ** 수정이 정상적으로 되었습니다! **");
			break;
		case '4':
			System.out.println("4 : ** 삭제가 정상적으로 되었습니다! **");
			break;
		case '5':
			System.out.println("5 : ** 정상적으로 종료 되었습니다. **");
			break;
			default :
				System.out.println("** 다시 입력해 주세요! **");
				break;	
		}
		}
	}
}
