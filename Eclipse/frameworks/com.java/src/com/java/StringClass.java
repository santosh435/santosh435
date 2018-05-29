package com.java;

import java.lang.reflect.Method;

public class StringClass {
	
	public int m2() {
		
		return 69;
		
	}
public static void main(String[] args) {
	
	StringBuffer str= new StringBuffer();
	 str = str.append("charan");
	 
	
	System.out.println(str.hashCode());
	
	str =str.append("arjun");
	str=str.replace(0, 6, "");
	System.out.println(str);
			System.out.println(str.hashCode());
			
			
			
			
			String s1 = new String();
			s1 = "jaggu";
			
			System.out.println(s1);
			System.out.println(s1.hashCode());
			
			s1  = s1+"babu";
			System.out.println(s1);
			System.out.println(s1.hashCode());
			
			
			String s = "jagadeesh";
			String a="";
			char b=0;
			for(int i=s.length();i>=1;i--) {
				b=s.charAt(i-1);
				a=a+b;
				
			
			}
			System.out.println(a);
			StringClass sc = new StringClass();
		int d=	sc.m2();
			System.out.println(d);
		
}
}
