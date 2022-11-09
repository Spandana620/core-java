package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.fruit.Fruit;
import com.xworkz.inheritanceapp.fruit.Mango;

public class FruitTester {
	public static void main(String a[]){
		Fruit ref=new Fruit();
		ref.giveEnergy();
		Mango hannu=new Mango();
		hannu.giveEnergy();
	}

}
