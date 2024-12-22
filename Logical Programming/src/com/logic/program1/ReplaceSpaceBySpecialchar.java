package com.logic.program1;

public class ReplaceSpaceBySpecialchar
{
   public static void main(String[] args)
   {
	String str="java programming";
	char[] ch = str.toCharArray();
	
    char c= str.charAt(0);
    
    for(int i=0;i<str.length();i++) {
    	if(ch[i]==' ')
    	{
    		ch[i]=c;
    	}
    }
}
}
