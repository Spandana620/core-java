class Mobile{
 static String brandName;
 static String color;
 static double price;
 static boolean isSwtichOnOrOf;
 static int maxVolume = 8;
 static int minVolume;
 static int currentVolume;
 
  public static boolean isSwtichOnOrOf(){
    System.out.println("inside Andriod Phone isSwtichOnOrOf()");
	if(isSwtichOnOrOf == true ){
	  isSwtichOnOrOf = false;
	  System.out.println("Andriod phone is working .....");	
	}
	else if (isSwtichOnOrOf == false ){
	  isSwtichOnOrOf = true;
	  System.out.println("Andriod phone is not working ....");
	}
      System.out.println("outside Andriod phone isSwtichOnOrOf()");	
		 return isSwtichOnOrOf;
	
  }
  public static void increaseVolume(){
	System.out.println("Inside increaseVolume()");
	if(isSwtichOnOrOf() == true){
	if(currentVolume < maxVolume){
		currentVolume = currentVolume +1;
	System.out.println("The Current volume is : " + currentVolume);
	}

	else{
		System.out.println("Max volume is reached......");
	}
	}
	
	else{
		System.out.println("Gube first Speaker on maadu...");
	}
	
	System.out.println("End of onOrOff()");
	return;
  }
  public static void decreseVolume(){
	  System.out.println("Inside the Speaker decreseVolume()");
	  if(isSwtichOnOrOf() == true){
		  if(currentVolume > minVolume){
			  currentVolume = currentVolume - 1;
			  System.out.println("The current volume is " + currentVolume);
		  }
		  else{
			  System.out.println("Min volume is reached......");
		  }
	  }
	  else{
		  System.out.println("Gube first speraker on maadu...");
	  }
		  System.out.println("End off onOrOff()");
		  return;
	  }
  }

