package com.string;

public class StringBufferr {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("kiran");
		System.out.println(sb.capacity()); // Original capacity is 16 and hence 16+5=21

		sb.append("hello java kiran12");
		System.out.println(sb.capacity()); // 18+ 5*2 + 16 = 44
		
		sb.append("hello java kiran hello java kiran");
		System.out.println(sb.capacity()); // 32+ 21*2 + 16 = 90
		
	}

}
