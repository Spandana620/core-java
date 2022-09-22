class Ac{
 static String brandName;
 static String color;
 static double price;
 static boolean isWorking;
 static int maxVolume = 8;
 static int minVolume;
 static int currentVolume;
  public static boolean onAndOf(){
   System.out.println("Inside the AC is onAndOf()");
   if(isWorking == true){
    isWorking = false;
   System.out.println("The AC is not working....");
   }
   if(isWorking == false){
     isWorking = true;
	System.out.println("The AC is working.....");
   }
   System.out.println("Outside the Ac is onAndOf()");
     return isWorking;
   }
   public static void increaseVolume(){
	System.out.println("Inside increaseVolume()");
	if(isWorking == true){
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
	  if(isWorking == true){
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

