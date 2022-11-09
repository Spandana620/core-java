package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.joker.Comedian;
import com.xworkz.inheritanceapp.joker.Joker;


public class ComedianTester {

	public static void main(String a[]){
		
		Comedian c=new Comedian();
		c.goodComedian();
		
		Joker j=new Joker();
		j.goodComedian();
	}

}
