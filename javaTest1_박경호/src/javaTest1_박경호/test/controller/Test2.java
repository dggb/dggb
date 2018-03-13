package javaTest1_박경호.test.controller;


public class Test2 {

	public static void main(String[] args) {
		
	for(int i=2; i<6;i++){
		for(int j=1; j<10;j++){
			if(j%2==0){
				continue;
			}
			System.out.println(i+"*"+j+"="+(i*j));
		}
	}
				

	}
}
