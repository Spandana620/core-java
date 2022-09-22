class Television{
  static String brandName;
  static String color;
  static double price;
  static boolean isRunning;
  static int maxVolume = 8;
 static int minVolume;
 static int currentVolume;
  
    public static boolean onAndOf(){
	  System.out.println("inside the tv onAndOf");
	  if(isRunning == true){
	   isRunning =  false;
	   System.out.println("The tv is off...."); 
	  }
	  if(isRunning == false){
	  isRunning = true;
	  System.out.println("The tv is on");
	  }
	  System.out.println("outside the tv onAndOf"); 
	  return isRunning;
	
	}
	public static void increaseVolume(){
	System.out.println("Inside increaseVolume()");
	if(isRunning == true){
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
	  if(isRunning == true){
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

