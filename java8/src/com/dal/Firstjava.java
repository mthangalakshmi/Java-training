package com.dal;
interface Addition{
	public int add(int a,int b);
}
public class Firstjava implements Addition{
	public int add(int a, int b) {
		
		return a+b;
	}
	public static void main(String[] args) {
		Firstjava f = new Firstjava();
		
		System.out.println(f.add(4, 5));

	}
}
