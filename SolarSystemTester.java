class SolarSystemTester{
 public static void main(String a[]){
  SolarSystem solar=new SolarSystem();
  solar.name="Earth";
  solar.radius="638 km";
  solar.age="2.6 billion years";

	System.out.println(solar.name + " "+solar.radius+" " +solar.age);
	
	SolarSystem solar1=new SolarSystem();
  solar1.name="Mars";
  solar1.radius="567 km";
  solar1.age="1.6 billion years";

	System.out.println(solar1.name + " "+solar1.radius+" " +solar1.age);
	
   SolarSystem solar2=new SolarSystem();
  solar2.name="Jupiter";
  solar2.radius="700 km";
  solar2.age="1.6 billion years";

	System.out.println(solar2.name + " "+solar2.radius+" " +solar2.age);
	
  SolarSystem solar3=new SolarSystem();
  solar3.name="Mercury";
  solar3.radius="400 km";
  solar3.age="2.3 billion years";

	System.out.println(solar3.name + " "+solar3.radius+" " +solar3.age);
	
  
  SolarSystem solar4=new SolarSystem();
  solar4.name="Venus";
  solar4.radius="234 km";
  solar4.age="1.6 billion years";

	System.out.println(solar4.name + " "+solar4.radius+" " +solar4.age);
	

 }

}