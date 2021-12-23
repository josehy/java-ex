package com.jcp.day10;

import java.util.Arrays;
import java.util.Random;

public class MySolution {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime(); 
		
		int[] datas = new int[10];
		int[] primenums = new int[10];		
		int cnt=0;
		while(cnt!=3) {  
			cnt=0;
			
			for (int i=0;i<10;i++)  { 
				datas[i]=(int)(Math.random()*60 + 5 - 0.5);
			}
			
			System.out.print(Arrays.toString(datas));  
			
			for(int i=0;i<datas.length;i++) {  
			
				boolean result=true;		
				for (int k=2;k<=datas[i]/2;k++) {
					if(datas[i] % k ==0) {
						result=false; break;	
					}	
				}	
				
				if(result) {  cnt++; primenums[i] = 1; }
				else primenums[i]=0;				
			} 
			
			System.out.println( ":::" + cnt);			
		}
		for (int i=0;i<datas.length;i++)
			System.out.println(datas[i] + "\t" + primenums[i]);
			
	}  

}
