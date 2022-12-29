package com.JavaException;
import java.util.Scanner;
public class Throw2 { 
	static void m1(String name) {
	if (name==null) {
		throw new NullPointerException("wrong input");
	}else {
		System.out.println(name);	
		System.out.println(name.length());
	}}
	public static void main(String[] args) {
      try {
    	  m1(null);
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
