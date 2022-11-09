package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.Nonveg.Chicken;
import com.xworkz.inheritanceapp.Nonveg.NonVeg;


public class NonVegTester {
	public static void main(String a[]){
		NonVeg non=new NonVeg();
		non.prepareBiriyani();
		Chicken ref=new Chicken();
		ref.prepareBiriyani();
}
}
