package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.searchEngine.Google;
import com.xworkz.inheritanceapp.searchEngine.SearchEngine;

public class SearchEnginetester {
   public static void main(String a[]){
	   SearchEngine search=new SearchEngine();
	   search.toSearch();
	   Google go=new Google();
	   go.toSearch();
   }
}
