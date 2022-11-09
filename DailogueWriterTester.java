package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.Dailoguewriter.DailogueWriter;
import com.xworkz.inheritanceapp.Dailoguewriter.Raghu;


public class DailogueWriterTester {
	public static void main(String a[]){
		DailogueWriter writer=new DailogueWriter();
		writer.writeStory();
		Raghu ref=new Raghu();
		ref.writeStory();
}
}
