class CollegeTester{
 public static void main(String a[]){
  College coll=new College();
  coll.name="Government Polytechnic college";
  coll.fees=10000.00;
  coll.address="ChamarajaNagara";

	System.out.println(coll.name + " "+coll.fees+" " +coll.address);
	
	College coll1=new College();
  coll1.name="Government Engineering college";
  coll1.fees=20000.00;
  coll1.address="ChamarajaNagara";
  System.out.println(coll1.name + " "+coll1.fees+" " +coll1.address);
  
  College coll2=new College();
  coll2.name="St.joseph's Engineering college";
  coll2.fees=20000.00;
  coll2.address="ChamarajaNagara";
  System.out.println(coll2.name + " "+coll2.fees+" " +coll2.address);
  
  College coll3=new College();
  coll3.name="Ambedkar college";
  coll3.fees=3000.00;
  coll3.address="ChamarajaNagara";
  System.out.println(coll3.name + " "+coll3.fees+" " +coll3.address);
  
  College coll4=new College();
  coll4.name="Jss womens college";
  coll4.fees=20000.00;
  coll4.address="ChamarajaNagara";
  System.out.println(coll4.name + " "+coll4.fees+" " +coll4.address);
	
  
  
 
 }

}