package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.petrolbunk.Hp;
import com.xworkz.inheritanceapp.petrolbunk.PetrolBunk;


public class PetrolBunkTester {
	public static void main(String a[]){
		PetrolBunk petrol=new PetrolBunk();
		petrol.hasPetrol();
		Hp ref=new Hp();
		ref.hasPetrol();
}
}
