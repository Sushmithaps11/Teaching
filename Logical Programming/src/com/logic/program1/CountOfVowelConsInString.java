package com.logic.program1;

public class CountOfVowelConsInString 
{
  public static void main(String[] args) 
  {
	  String str="Sushmitha";
	char[]ch  =str.toCharArray();
	int countv=0;
	int countC=0;
	
	for(int i=0;i<ch.length;i++)
	{
	
		if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'&&ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') 
		{
			countv++;
		}
		else {
			countC++;
		}
	}
	System.out.println(countv);
	System.out.println(countC);
}
} 

