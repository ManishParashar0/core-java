package com.JavaException;

public class thow {
void m1(int a) throws Exception{
	if(a>9) {
		System.out.println("right");
	}
	else{
		 throw new Exception("invalid");
		
	}
	
}
thow(){
	System.out.println();
	
	
}

public static void main(String[] args) throws Exception {
	thow sc=new thow();
	
	sc.m1(1);
}

}
