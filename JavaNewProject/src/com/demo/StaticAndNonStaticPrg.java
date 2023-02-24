package com.demo;

public class StaticAndNonStaticPrg {
	
	public StaticAndNonStaticPrg() {
		System.out.println("this is from constructor");
	}
public static void main(String[] args) {
	System.out.println("this is from main method");
	StaticAndNonStaticPrg obj1=new StaticAndNonStaticPrg();
	StaticAndNonStaticPrg obj2=new StaticAndNonStaticPrg();
	StaticAndNonStaticPrg obj3=new StaticAndNonStaticPrg();
}

static {
	System.out.println("this is from static block");
}

{
	System.out.println("this is from non-static block");
}

}
