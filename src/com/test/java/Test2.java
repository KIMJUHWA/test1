package com.test.java;

import java.util.Scanner;

public class Test2 {
	
	String[] man = new String[4];
	
	int input = 0;
	int inputFloor = 0;
	int inputArray;
	int nowFloor = 1;
	
	
	
	public void elevator() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("엘리베이터 상태 [현재층 : " + nowFloor + " ]");
			System.out.println("[ "  + "]" +"[ " + "]" + "[ " + "]" + "[ " + "]");
			System.out.println("행동을 입력하세요.");
			System.out.println("1.이동   2.탑승  9.종료");
			
			input = scan.nextInt();
			switch (input) {
			case 1:
				System.out.println("몇 층으로 갈램? [현재층 : " + nowFloor + " ]");
				inputFloor = scan.nextInt();	
				if(inputFloor == nowFloor) {
					System.out.println("같은 층이야 놀리냥 다시 눌럿");
				} else if(inputFloor > 0 && inputFloor < 4) {
					nowFloor = inputFloor;
					System.out.println(inputFloor + "층에 도착했웅");
				} else
					System.out.println("1 ~ 3층만 운행해 다시 눌럿");
				break;
			case 2:
				System.out.println("어디에 탈래? [취소 : 9]");
				System.out.println("[0][1][2][3]");
				inputArray = scan.nextInt();
				
				man[inputArray] = "★";
				System.out.println(man[inputArray]);
				System.out.println(inputArray + "번째에 탔당");
				break;
			case 9:
				System.out.println("운행을 마칠께~ 담에 또봐");
				break;
			default:
				System.out.println("****선택지 중에 입력하세요****");
				break;
			}
			
			if(input == 9) {
				break;
			}
		}
	}
}
	