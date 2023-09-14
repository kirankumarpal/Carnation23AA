package com.string;

public class Buffer_Reader {
	public static void main(String[] args) {
		String s = new String("Hello ");
		s.concat("String");

		StringBuffer sb = new StringBuffer("Hello "); // all methods are snychronized
		sb.append("String Buffer");

		StringBuilder sbu = new StringBuilder("Hello ");
		sbu.append("String Builder");
		
		
		System.out.println(s);
		System.out.println(sb);
		System.out.println(sbu);

	}
}
