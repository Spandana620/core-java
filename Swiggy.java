class Swiggy{
  public static double takeOrder(String item){
	  
 
   if(item == "pizza"){
     System.out.println("Thank you for ordering " + item);
	 return 99.00;
   }
   if(item == "Burger"){
     System.out.println("Thank you for ordering " + item);
	 return 70.00;
	 }
	 if(item == "Sandwitch"){
     System.out.println("Thank you for ordering " + item);
	 return 50.00;
	 }
	 if(item == "Mosranna"){
     System.out.println("Thank you for ordering " + item);
	 return 25.00;
	 }
	 if(item == "FrenchFries"){
     System.out.println("Thank you for ordering " + item);
	 return 50.00;
	 }
	 if(item == "Pastries"){
     System.out.println("Thank you for ordering " + item);
	   return 60.00;
	 }
	 return 0.00;
	 
   }
  
  

public static double takeOrder(String item,double quantity){
	 
   
   if(item == "pizza"){
     System.out.println("Thank you for ordering " + item);
	 return (99.00*quantity);
   }
   if(item == "Burger"){
     System.out.println("Thank you for ordering " + item);
	 return (70.00*quantity);
	 }
	 if(item == "Sandwitch"){
     System.out.println("Thank you for ordering " + item);
	 return (50.00*quantity);
	 }
	 if(item == "Mosranna"){
     System.out.println("Thank you for ordering " + item);
	 return (25.00*quantity);
	 }
	 if(item == "FrenchFries"){
     System.out.println("Thank you for ordering " + item);
	 return (50.00*quantity);
	 }
	 if(item == "Pastries"){
     System.out.println("Thank you for ordering " + item);
	   return (60.00*quantity);
	 }
	 return 0.00;
	
   }
  
  }