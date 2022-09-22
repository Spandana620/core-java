class VivantaTajHotel{
 public static void main(String a[]){
    String type = "5 star hotel";
    String address = "MG ROAD, BANGLORE";
    String[] managerNames={"Spandana","Geetha" ,"Shalini","Hema"};
    int noOfManagers=4;
    int noOfFoods=16;
	
    String foodMenu[]={"Masala dosa","palav", "paneer gravy","pizza","burgur","french fries", 
                   "Ghee rice", "Gobi maanchurian","roti","ice creams", "juices","Noodels",
				   "vegitable curry","potato fry","curd rice","butter dosa"};
    System.out.println("WELCOME TO VIVANTA TAJ HOTEL");
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
  }						
}
				   
				   
				   

