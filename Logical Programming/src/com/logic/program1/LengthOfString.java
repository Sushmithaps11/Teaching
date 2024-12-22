package com.logic.program1;

import java.util.Iterator;

public class LengthOfString 
{
  public static void main(String[] args) {
	String str="Sushmitha";
	char[]ch=str.toCharArray();
	
	int count=0;
	for(int i=0;i<ch.length;i++) {
		count++;
	}
	System.out.println(count);
}
}
