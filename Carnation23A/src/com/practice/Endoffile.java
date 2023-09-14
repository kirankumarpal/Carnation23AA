package com.practice;
import java.util.*;
public class Endoffile {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i =1; sc.hasNext(); i++){
            System.out.println(i + " "+ sc.nextLine());
        }
        sc.close();
    }
	
}
