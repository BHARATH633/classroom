package com.abc.test;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Occurence {
	public static void main(String[] args) 
	{
	String x="today is sunday";
	char y[]=x.toCharArray();
	int size=y.length;
    LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
	int i=0;
	while(i!=size)
		{
		if(map.containsKey(y[i])==false)
			{
			map.put(y[i],1);
			}
			else  
			{
             int oldval=map.get(y[i]);
              int newval=oldval+1;
			  map.put(y[i],newval);
			}
			i++;
		}
	Set<Map.Entry<Character,Integer>>lmap=map.entrySet();
	for(Map.Entry<Character,Integer> pot:lmap)
	{
		if(pot.getValue()>1)
		{
			System.out.print(pot.getKey());
			System.exit(0);
		}
	//	System.out.print(pot.getKey()+" ");
		//System.out.print(pot.getValue());
	
	System.out.println();
	}	
	}
}
