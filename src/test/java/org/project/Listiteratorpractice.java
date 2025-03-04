package org.project;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Listiteratorpractice {
	
	public static void main(String[] args) {
		
		List<String> l = new LinkedList<>();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("e");
		l.add("f");
		
		ListIterator<String> li= l.listIterator();
		
		while(li.hasNext()) 
		{
			String next = li.next();
			System.out.println(next);
		}
		
//		while(li.hasPrevious()) 
//		{
//			String previous = li.previous();
//			System.out.println(previous);
//		}
		
		while(li.hasPrevious()) 
		{
			String next = li.previous();
			if(next.equals("b")) 
			{
				li.add("batman");
			}
			else if(next.equals("d")) 
			{
				li.remove();
			}
			else if(next.equals("f")) 
			{
				li.set("father");
			}
		}
		
		System.out.println(l);
		
		
		
	}

}
