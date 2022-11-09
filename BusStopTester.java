package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.busstop.BusStop;
import com.xworkz.inheritanceapp.busstop.Mejestick;


public class BusStopTester {
	public static void main(String a[]){
		BusStop bus=new BusStop();
		bus.toGivestop();
		Mejestick ref=new Mejestick();
		ref.toGivestop();
}
}
