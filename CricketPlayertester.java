package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.CricketPlayer.CricketPlayer;
import com.xworkz.inheritanceapp.CricketPlayer.ViratKohli;


public class CricketPlayertester {
	public static void main(String a[]){
		CricketPlayer player=new CricketPlayer();
		player.playCricket();
		ViratKohli virat=new ViratKohli();
		virat.playCricket();
}
}
