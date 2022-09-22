class Truppels{
 public static void main(String a[]){
    String type = "5 star hotel";
    String address = "yashawanthnagar";
    String[] managerNames={"punith","shalini","preethi","thirsha","dharshan"};
    int noOfManagers=5;
    int noOfFoods=10;
	int noOfnonVegFoodMenus=5;
	String[] nonVegFoodMenus={"chikken","motton","chikken biriyani","kabab","chikken lalipop"};
	
    String foodMenu[]={"Masala dosa","palav", "paneer gravy","pizza","burgur","french fries", 
                   "Ghee rice", "Gobi maanchurian","roti","ice creams"};
    System.out.println("WELCOME TO Tripples");
    System.out.println("WHICH STAR HOTEL IS THIS " +type);
	System.out.println("HOTEL ADDRESS IS " +address);
	System.out.println("Hotel Manager Names are");
	
	for(int i=0;i<managerNames.length;i++){
    System.out.println(managerNames[i]);
      }
	System.out.println("Food menus in hotel are"); 
	for(int j=0;j<foodMenu.length;j++){
    System.out.println(foodMenu[j]);
	}
	for(int k=0; k<nonVegFoodMenus.length; k++){
	
	System.out.println(nonVegFoodMenus[k]);
	}
    }
  }						

				   
				   
				   
