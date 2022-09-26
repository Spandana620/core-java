class Forniture{

  static String name;
  static int price;
  static String color;
  static String warantty;
  
   public static void setName(String fname){
    name=fname;
  }
  public  static String getName(){
  return name;
  }
  
  public static void setPrice(int amt){
       price=amt;
  }
   public static int getPrice(){
   return price;
  }
   public static void setColor(String fcolor){
       color=fcolor;
  }
   public static String getColor(){
     return color;
  }
  public static void setwarantty(String exp){
    warantty=exp;
  }
 public static String getWarantty(){
    return warantty;
  }
}