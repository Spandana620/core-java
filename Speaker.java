class Speaker{
 static String brandName;
 static String color;
 static double price;
 static boolean isConnected;
 static int maxVolume = 8;
 static int minVolume;
 static int currentVolume;
 
   public static boolean onOrOff(){
   System.out.println("Inside onOrOff()");
   if(isConnected == false){
    isConnected = true;
	System.out.println("Speaker is turned on.....");
  }
  else if (isConnected == true){
       isConnected = false;
	    System.out.println("Speaker is turned off");
  }
  System.out.println("end of the onOrOff()");
  return isConnected;
   }

  public static void increaseVolume(){
	System.out.println("Inside increaseVolume()");
	if(isConnected == true){
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
	  if(isConnected == true){
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
