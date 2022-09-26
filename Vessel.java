class Vessel{

  static String brandName;
  static int price;
  static String warantty;
  static String type;
  
   public static void setBrandName(String bname){
    brandName=bname;
  }
  public  static String getName(){
  return brandName;
  }
  
  public static void setPrice(int amt){
       price=amt;
  }
   public static int getPrice(){
   return price;
  }
   public static void setWarantty(String exp){
       warantty=exp;
  }
   public static String getWarantty(){
     return warantty;
  }
  public static void setType(String vType){
    type=vType;
  }
 public static String getType(){
    return type;
  }
}