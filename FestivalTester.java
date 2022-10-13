class FestivalTester{
 public static void main(String a[]){
  Festival fest=new Festival();
  fest.festivalName="Deepavali";
  fest.date="20-oct-2022";
  fest.relegion="Hindu";

	System.out.println(fest.festivalName + " "+fest.date+" " +fest.relegion);
	
	Festival fest1=new Festival();
  fest1.festivalName="Chirstmas";
  fest1.date="25-dec-2022";
  fest1.relegion="Christian";

	System.out.println(fest1.festivalName + " "+fest1.date+" " +fest1.relegion);

	Festival fest2=new Festival();
  fest2.festivalName="Ganesha Chaturthi";
  fest2.date="22-aug-2022";
  fest2.relegion="Hindu";

	System.out.println(fest2.festivalName + " "+fest2.date+" " +fest2.relegion);
  
  Festival fest3=new Festival();
  fest3.festivalName="Ugadhi";
  fest3.date="23-mar-2022";
  fest3.relegion="Hindu";

	System.out.println(fest3.festivalName + " "+fest3.date+" " +fest3.relegion);
	
  
 Festival fest4=new Festival();
  fest4.festivalName="Ramzan";
  fest4.date="16-june-2022";
  fest4.relegion="Muslim";

	System.out.println(fest4.festivalName + " "+fest4.date+" " +fest4.relegion);
  

 }

}