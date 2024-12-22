package com.logic.program1;

public class Armstrong
{
  public static void main(String[] args) 
  {
	int num=153;
	
	int arm=0;
	int orginalnum = num;
	
	while(num>0)
	{
		int rem = num%10;
		arm = (rem*rem*rem)+arm;
		num = num/10;
	}	
		if(orginalnum==arm)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
	
  }
}
