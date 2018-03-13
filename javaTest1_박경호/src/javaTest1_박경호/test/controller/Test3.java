package javaTest1_박경호.test.controller;

public class Test3 {

	public static void main(String[] args) {
		
		/*int sum = 0;
		int count = 0;
		for(int i=1; i<=100;i++){
			sum += i;
			count ++;
		}
		System.out.println((double)sum);
		System.out.println((double)sum/count);
		*/
		int sum =0;
		int count = 1;
		
		while(count<=100){
			sum+=count;
			count++;
			
		}
		System.out.println((double)sum);
		System.out.println((double)sum/(count-1));
	}

}
