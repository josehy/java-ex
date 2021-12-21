package com.jcp.day1;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
	    double height, width;
	    double area;
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("-------------------------------------");
	    System.out.println("*사각형의 넓이를 구하는 프로그램입니다.*");
	    System.out.println("사각형의 높이 (단위 : cm) >>> " );   
	    height = sc.nextDouble();
	    System.out.println("사각형의 너비 (단위 : cm) >>> " );
	    width = sc.nextDouble();
	      
	    System.out.println("\n사각형의 넓이를 구했습니다.............");
	    area = height*width ;
	    System.out.printf("%.3f x %.3f = %.5f (단위:㎠)  \n",height,width,area);
	    System.out.println("--------------------------------------");
		
	}

}
