package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.wildlifesanctuary.WildLIfeSanctuary;
import com.xworkz.inheritanceapp.wildlifesanctuary.Zoo;


public class WildLIfeSanctuaryTester {
	public static void main(String a[]){
		WildLIfeSanctuary animal=new WildLIfeSanctuary();
		animal.haveAnimals();
		Zoo z=new Zoo();
		z.haveAnimals();
}
}
