package org.project;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iteratorpractice {
	
	
	public static void main(String[] args) {
		
		Set<String> s = new HashSet();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add("e");
		s.add("f");
		
		Iterator<String> i = s.iterator();
		while(i.hasNext()) 
		{
			String next = i.next();
			System.out.println(next);
			
			if(next.equals("d")) 
			{
				i.remove();
			}
		}
		
		System.out.println(s);
	}

}
