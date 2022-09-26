class Mannu{

  static String name;
  static int price;
  static String color;
  static String quantity;
  
   public static void setName(String mname){
    name=mname;
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
  public static void setQuantity(String qun){
    quantity=qun;
  }
 public static String getQuantity(){
    return quantity;
  }
}