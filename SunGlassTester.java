class SunGlassTester{
 public static void main(String a[]){
  SunGlass glass=new SunGlass();
  glass.color="Black";
  glass.quality="high";
  glass.price=200;

	System.out.println(glass.color + " "+glass.quality+" " +glass.price);
	
	SunGlass glass1=new SunGlass();
  glass1.color="Blue";
  glass1.quality="high";
  glass1.price=300;

	System.out.println(glass1.color + " "+glass1.quality+" " +glass1.price);

	SunGlass glass2=new SunGlass();
  glass2.color="Brown";
  glass2.quality="high";
  glass2.price=250;

	System.out.println(glass2.color + " "+glass2.quality+" " +glass2.price);
  
  SunGlass glass3=new SunGlass();
  glass3.color="Yellow";
  glass3.quality="low";
  glass3.price=100;

	System.out.println(glass3.color + " "+glass3.quality+" " +glass3.price);
  
   SunGlass glass4=new SunGlass();
  glass4.color="Black";
  glass4.quality="low";
  glass4.price=100;

	System.out.println(glass4.color + " "+glass4.quality+" " +glass4.price);
  SunGlass sun=glass4;
  System.out.println(sun.color + " "+sun.quality+" " +sun.price);
  

 }

}