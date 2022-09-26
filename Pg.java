class Pg{

  static String pgName;
  static String address;
  static int price;
  static String pgType;
  
   public static void setPgName(String name){
    pgName=name;
  }
  public  static String getPgName(){
  return pgName;
  }
  
  public static void setAddress(String add){
       address=add;
  }
   public static String getAddress(){
   return address;
  }
   public static void setPrice(int amt){
       price=amt;
  }
   public static int getPrice(){
     return price;
  }
  public static void setPgType(String pType){
    pgType=pType;
  }
 public static String getPgType(){
    return pgType;
  }
}