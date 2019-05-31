package com.test.java;

import java.util.Scanner;

public class Test1 {
	
	int[] 사람 = {0,1,2,3};
	int[] 층 = {1,2,3};
	
	int input2 = 0;  // 층 입력 받기
	int a = 0;
		
	public void move() {	
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("엘리베이터 상태 [현재층 : " + 층[a] + "]");
			System.out.println("[ " + "]" +"[ " + "]" + "[ " + "]" + "[ " + "]");
			System.out.println("행동을 입력하세요.");
			System.out.println("1.이동   2.탑승  9.종료");
			int input = 0;
			input = scan.nextInt();
			
			if(input == 1) {
				System.out.println("몇층으로 가시겠습니까? [현재층 : " + 층[a] + "]");
				input2 = scan.nextInt();
					if(input2 > 0 && input2 < 4) {
						System.out.println(input2 + "층으로 이동합니다.");
					} else if(층[a] == input2){
						System.out.println("현재 " + input2 + "층 입니다.");
					} else
						System.out.println("1 ~ 3층만 운행합니다.");
						if(input2 == 1) {
							층[a] = 1;
						} else if(input2 == 2) {
							층[a] = 2;
						} else if(input2 == 3) {
							층[a] = 3;
						}
					
			} else if(input == 2) {
				System.out.println("어디에 탑승하시겠습니까? [취소 : 9]");
				input2 = scan.nextInt();
					if(input2 >= 0 && input2 <=3) {
						System.out.println(input2 + "번째에 탑승 하셨습니다.");
					}else if(input2 == 9) {
						System.out.println("취소합니다.");
						move();
					}
			} else if(input == 9) {
				System.out.println("엘리베이터 운행을 종료합니다.");
				break;
			} else
				System.out.println("*******선택지 중에 선택하세요*******");
		}
	}
}
