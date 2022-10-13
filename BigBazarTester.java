class BigBazarTester{
 public static void main(String a[]){
  BigBazar sale=new BigBazar();
  sale.productName="Lipstick";
  sale.price=200.00;
  sale.address="Banglore";

	System.out.println(sale.productName + " "+sale.price+" " +sale.address);
	
	BigBazar sale1=new BigBazar();
  sale1.productName="Kaja;";
  sale1.price=100.00;
  sale1.address="Mysore";

	System.out.println(sale1.productName + " "+sale1.price+" " +sale1.address);
	
  
  BigBazar sale2=new BigBazar();
  sale2.productName="Mascara";
  sale2.price=150.00;
  sale2.address="Hasan";

	System.out.println(sale2.productName + " "+sale2.price+" " +sale2.address);
	
  
  BigBazar sale3=new BigBazar();
  sale3.productName="Eye Shadow";
  sale3.price=80.00;
  sale3.address="Chikkaballapur";

	System.out.println(sale3.productName + " "+sale3.price+" " +sale3.address);
  
  BigBazar sale4=new BigBazar();
  sale4.productName="Foundation";
  sale4.price=500.00;
  sale4.address="Bellary";

	System.out.println(sale4.productName + " "+sale4.price+" " +sale4.address);
  
  

 }

}