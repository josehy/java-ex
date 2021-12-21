package com.jcp.day1;

public class DataTest2 {

	public static void main(String[] args) {
		
	double num1 = 3.1417; // 8바이트
	//실수는 double이 기본, 실수를 리터럴로 쓸때 f를 붙여서 float으로 지정합니다.
	float num2 = 3.1417f;  // 4바이트
	//소스파일안에서 직접 데이터를 쓸 때 리터럴이라고 합니다.
	System.out.println("실수 num1 :" + num1);
	System.out.println("실수 num2 :" + num2);
	
	num1=2.456;
	num2=101.345f;
    System.out.println("실수 num1 :" + num1);
	System.out.println("실수 num2 :" + num2);
	
	System.out.println(":::Double 클래스로 데이터타입 정보확인-double :::");
    System.out.println("double 변수의 크기 : " + Double.BYTES +" 바이트");
    System.out.println("double 변수의 최대값 : " + Double.MAX_VALUE);
    System.out.println("double 변수의 최소값 : " + Double.MIN_VALUE);
    
	System.out.println(":::Float 클래스로 데이터타입 정보확인-float :::");
    System.out.println("float 변수의 크기 : " + Float.BYTES +" 바이트");
    System.out.println("float 변수의 최대값 : " + Float.MAX_VALUE);
    System.out.println("float 변수의 최소값 : " + Float.MIN_VALUE);
	}

}
