package com.test.java;

import java.util.Scanner;

public class Elevator {
	public static void main(String[] args) {
		int[] ele = {0,0,0,0};
		int stair = 1;
		boolean state = true;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("엘리베이터 상태[현재층 : " + stair + "]");
			for(int i : ele) {     // 이게 모야
				if(i != 0) {
					System.out.print("[" + i + "]");
				} else
					System.out.print("[ ]");
				
			}
		}
	}
}