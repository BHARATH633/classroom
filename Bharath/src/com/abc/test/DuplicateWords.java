




package com.abc.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class DuplicateWords {
	public static void main(String[] args) 
	{
	String x="today is sunday today is monday sunday  ";
	String[] y =x.split(" ");
	Map<String,Integer> hmap=new LinkedHashMap<>();
	for(String words:y)
	{
		if(hmap.get(words) == null)
		{
			hmap.put(words,1);
		}
		else
		{
			hmap.put(words,hmap.get(words)+1);
		}
	}
	Iterator<String> itr=hmap.keySet().iterator();
	while(itr.hasNext())
	{
		String temp=itr.next();
		if(hmap.get(temp)>1)
		{
			System.out.println(temp+" "+hmap.get(temp));
		}
	}
	

	}
}
