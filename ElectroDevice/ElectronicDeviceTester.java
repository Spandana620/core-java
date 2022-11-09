package com.xworkz.inheritanceapp.ElectroDevice;

public class ElectronicDeviceTester {
  public static void main(String a[]){
	  ElectronicDevice elect=new ElectronicDevice();
	  elect.hasManyDevice();
	  Laptop lap=new Laptop();
	  lap.hasManyDevice();
  }
}
