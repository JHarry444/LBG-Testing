package com.qa.testing;

public class MikeString {

	public static void main(String[] args) {
		System.out.println("Mike" == "mike");
		System.out.println(new String("Mike") == new String("Mike"));
		System.out.println(new String("Mike").equals(new String("Mike")));
	}
}
