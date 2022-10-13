class RiceTester{
 public static void main(String a[]){
  Rice r=new Rice();
  r.name="Sonamasuri";
  r.quantity="25 kg";
  r.price=2000.00;

	System.out.println(r.name + " "+r.quantity+" " +r.price);
	
	Rice r1=new Rice();
  r1.name="Bullet";
  r1.quantity="30 kg";
  r1.price=2500.00;

	System.out.println(r1.name + " "+r1.quantity+" " +r1.price);

	Rice r2=new Rice();
  r2.name="maleBennuru";
  r2.quantity="5kg";
  r2.price=1000.00;

	System.out.println(r2.name + " "+r2.quantity+" " +r2.price);
  
  Rice r3=new Rice();
  r3.name="Sannakki";
  r3.quantity="40kg";
  r3.price=2500.00;

	System.out.println(r3.name + " "+r3.quantity+" " +r3.price);
  
 Rice r4=new Rice();
  r4.name="kudisalakki";
  r4.quantity="25 kg";
  r4.price=2000.00;

	System.out.println(r4.name + " "+r4.quantity+" " +r4.price);
  

 }

}