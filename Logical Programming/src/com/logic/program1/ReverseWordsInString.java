package com.logic.program1;

public class ReverseWordsInString
{
  public static void main(String[] args) 
  {
	String str="welcome to java";
	String[] sp=str.split(" ");
	String rev="";
	
	for(String s:sp ) {
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		
		rev=rev+sb.toString()+" ";
		
	}
	System.out.println(rev);
}
}
