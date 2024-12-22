package com.logic.program1;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map
{
  public static void main(String[] args)
  {
	HashMap<Integer,String> mp = new HashMap<Integer,String>();
	
	mp.put(101,"david");
	mp.put(102,"scott");
	mp.put(103,"elon");
	mp.put(104,"mayer");
	mp.put(105,"scott");
	
	System.out.println(mp);
	
	System.out.println(mp.get(104));
	
	mp.remove(103);
	System.out.println(mp);
	
	System.out.println(mp.containsKey(104));
	System.out.println(mp.containsValue("scott"));
	
	System.out.println(mp.isEmpty());
	
	System.out.println(mp.keySet());//[101, 102, 104, 105]
	System.out.println(mp.values());//[david, scott, mayer, scott]
	
	System.out.println(mp.entrySet());
	//System.out.println(mp);
	
	//getting only keys
	/*for(int i:mp.keySet()) 
	{
		System.out.println(i);
	}
	*/
	//getting only values
/*	for (Object e : mp.values()) {
		System.out.println(e);
	}*/
	
	//getting both key and value
	for(Object e:mp.keySet())
	{
		System.out.println(e+"    "+mp.get(e));
	}
	
	//By entry methods getting both key and value
	for(Entry<Integer, String> entry : mp.entrySet())
	{
		System.out.println(entry.getKey()+"   "+entry.getValue());
	}
}
}
