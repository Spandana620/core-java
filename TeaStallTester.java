class TeaStallTester{

 public static void main(String a[]){
 
   TeaStall.setTeaStallId(5678);
   TeaStall.setName("Mahadeva Tea Stall");
   TeaStall.setAddress("Malleshwaram");
   TeaStall. setContactNumber(9876543210L);
   
  // TeaStall.name = "Beereshwara TeaStall";
   //TeaStall.address="Malleshwaram";
   //TeaStall.contactNumber = 9876543210L;
   
  // System.out.println(TeaStall.getTeaStallId());
   // System.out.println(TeaStall.getName());
	//System.out.println(TeaStall.getAddress());
   //System.out.println(TeaStall.getContactnumber());
   
   
   System.out.println(TeaStall.getTeaStallId() +" "+ TeaStall.getName() + " " + TeaStall.getAddress() + " " +  TeaStall. getContactnumber());
 
 }

}