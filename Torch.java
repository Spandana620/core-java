class Torch{
 static String brandName;
 static String color;
 static double price;
 static boolean isSwitch;
 static int maxVolume = 8;
 static int minVolume;
 static int currentVolume;
 
  public static boolean isOnAndOf(){
   System.out.println("Inside the torch isOnAndOf()");
   if(isSwitch == true){
    isSwitch = false;
	System.out.println("The torch is not working...");
   }
   else if(isSwitch == false){
    isSwitch = true;
   System.out.println("The torch is working....");
}
   System.out.println("outside the torch isOnAndOf()");
    return isSwitch;
	}
	 public static void increaseVolume(){
	System.out.println("Inside increaseVolume()");
	if(isSwitch == true){
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
	  if(isSwitch == true){
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

	
