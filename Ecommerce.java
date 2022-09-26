class Ecommerce{

  static int pricingId;
  static String sku;
  static int price;
  static String currency;
  
   public static void setPricingId(int pId){
    pricingId=pId;
  }
  public  static int getPricingId(){
  return pricingId;
  }
  
  public static void setSku(String skku){
       sku=skku;
  }
   public static String getSku(){
   return sku;
  }
   public static void setPrice(int cost){
       price=cost;
  }
   public static int getPrice(){
     return price;
  }
  public static void setCurrency(String amt){
    currency=amt;
  }
 public static String getCurrency(){
    return currency;
  }
}