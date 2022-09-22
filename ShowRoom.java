class ShowRoom{
   public static void getCars(String[] cars){
    System.out.println("inside the getCars()");
	System.out.println("Cars names is " + cars);
	for(int i=0;i<cars.length;i++){
	   System.out.println(cars[i]);
	}
	System.out.println("end of the cars()");
    }
	public static void getBikes(String[] bike){
	  System.out.println("Inside the getBikes()");
	   System.out.println("Bikes names are " + bike);
	   for(int j=0;j<bike.length;j++){
	    System.out.println(bike[j]);
	   }
	   System.out.println("end of the cars()");
	}
   }
