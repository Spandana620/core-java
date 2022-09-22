class Trimmer{

 public static void main(String a[]){
  String brandName = "Philips" ;
  String color = "Black";
  String warranty = "1 year";
  int  price = 800;
  String [] Setting = {"on","off","Speed","work","Charge"};
  
  String ref0 = Setting[0];
  String ref1 = Setting[1];
  String ref2 = Setting[2];
  String ref3 = Setting[3];
  String ref4 = Setting[4];
  
  System.out.println("Trimmer Settings are " + ref0);
  System.out.println("Trimmer Settings are " + ref1);
  System.out.println("Trimmer Settings are " + ref2);
  System.out.println("Trimmer Settings are " + ref3);
  System.out.println("Trimmer Settings are " + ref4);
  
  for(int j=0;j<Setting.length;j++){
  String ref = Setting[j];
  System.out.println(Setting[j]);
  System.out.println("The Trimmer Settings are " + " ref");
  }
 
 
 
 }


}