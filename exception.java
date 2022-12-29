package com.JavaException;

public class exception {
	
	void m1(int a) throws Exception {
		if(a>9) {
			System.out.println("right");
		}
		else{
			 throw new Exception("invalid");
			
		}
		
	}
	

	public static void main(String[] args)  {
		thow sc=new thow();
		try {
			sc.m1(1);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	}


