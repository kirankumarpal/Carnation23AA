package com.innerclasses;

/**
 * 
 * @author KP from 1.8 int i = 11 can run, before 1.8 it was mandatory to declare
 *         it final
 */
public class Method_local_innerclass {

	public class C {

		public void m1() {
			int i = 11;
			System.out.println("m1 of C");
			class C1 {
				public void m2() {
					System.out.println("m2 of C1");
					System.out.println(i);
				}
			}
			C1 c = new C1();
			c.m2();
		}
	}

	public static void main(String[] args) {
		C d = new Method_local_innerclass().new C();
		d.m1();
	}
}
