package org.project;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerationpractice {
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector();
		v.add("a");
		v.add("b");
		v.add("c");
		v.add("d");
		v.add("e");
		v.add("f");
		
        Enumeration<String> e = v.elements();
        
        while(e.hasMoreElements()) 
        {
        	String ne = e.nextElement();
        	System.out.println(ne);
        }

		
	}

}
