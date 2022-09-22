class EmpireHotel{
 public static void main(String a[]){
    String type = "5 star hotel";
    String address = "RajajiNagar Bangalore";
    String[] managerNames={"Spandana","Raghu","Ram","Suchana" ,"Suma","Chandu",};
    int noOfManagers=6;
    int noOfVegFoods=20;
	int noOfNonVegFood=15;
	int noOfSeaFood=5;
	
    String[] noOfVegFoodMenu={"Masala dosa","fried rice","palav", "paneer gravy","pizza","burgur","french fries", 
                   "Ghee rice", "Gobi maanchurian","roti","ice creams", "juices","Noodels",
		"vegitable curry","potato fry","curd rice","butter dosa","Paneer Tikka","Babycorn Manchrian","Paneer Butter Masala"};
	String[] noOfNonVegFoodMenu={"chicken biriyani","chicken kabab","chicken 65","Mutton biriyani","chicken laalipop","mutton soup","mutton chaps","chicken keema","Fish Finger","Fish fry","fish kabab","Shawarma","chilly chicken","Dham biriyani","ambur biriyani"};
	String[] noOfSeaFoodMenu={"fish fry","fish kabab","fish finger","prawan fry"};
    System.out.println("WELCOME TO EMPIRE HOTEL");
    System.out.println("WHICH STAR HOTEL IS THIS " +type);
	System.out.println("HOTEL ADDRESS IS " +address);
	System.out.println("Hotel Manager Names are");
	
	for(int i=0;i<managerNames.length;i++){
    System.out.println(managerNames[i]);
      }
	System.out.println("Food menus in hotel are"); 
	for(int j=0;j<noOfVegFoodMenu.length;j++){
    System.out.println(noOfVegFoodMenu[j]);
    }
	System.out.println("Non veg food menus are");
	   for(int k=0; k<noOfNonVegFoodMenu.length;k++){
	    System.out.println(noOfNonVegFoodMenu[k]);
  }	
     System.out.println("See foods are available in this hotel");  
    for(int m=0;m<noOfSeaFoodMenu.length;m++){
	System.out.println(noOfSeaFoodMenu[m]);
	
	}
	System.out.println("THANK YOU");
	
}
				   
				   
				   
}
