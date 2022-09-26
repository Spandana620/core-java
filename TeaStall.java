class TeaStall {

   static int teaStallId;
   static String name;
   static String address;
   static long contactNumber;
   
   //setter and getter
   
   static void setTeaStallId(int id){  
	   teaStallId = id;
	   
   }
   
   static int getTeaStallId(){
	   return teaStallId;
   }
   
   static void setName(String tname){
	        name = tname;
   }
   
     static String getName(){
		 return name;
	 }
	 
	    static void setAddress(String adres){
	        address = adres;
   }
   
     static String getAddress(){
		 return address;
	 }
	 
	
   
   static void setContactNumber(long cNo){
	    contactNumber = cNo;
	   
   }
    
	static long getContactnumber(){
		return contactNumber;
	}
}
