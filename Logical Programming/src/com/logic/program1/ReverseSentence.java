package com.logic.program1;

public class ReverseSentence
{
	public static void main(String[] args) {
		
   String str="java is fun";
   String[] s = str.split(" ");
   String rev = "";
   
   for(int i=0;i<s.length;i++)
   {
	   rev=s[i]+" "+rev;
   }
   System.out.println(rev);
}
}
