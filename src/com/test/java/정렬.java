package com.test.java;

public class 정렬 {
	
	public void ev() {
	
		int[] num = {12,1,8,10,27};
	
		int a = 0;
		for(int i =0; i < num.length; i++) {
			for(int j = i+1; j < num.length; j++) {
				if(num[i] < num[j]) {
					a = num[i];
				    num[i] = num[j];
				    num[j]= a;
				}
			}
			System.out.println(num[i]);
		}
	}
}