class Galaxy{

  static String galaxyName;
  static String color;
  static String temprature;
  static String type;
  
   public static void setGalaxyName(String gName){
    galaxyName=gName;
  }
  public  static String getGalaxyName(){
  return galaxyName;
  }
  
  public static void setColor(String gColor){
       color=gColor;
  }
   public static String getColor(){
   return color;
  }
   public static void setTemprature(String heat){
       temprature=heat;
  }
   public static String getTemprature(){
     return temprature;
  }
  public static void setType(String gType){
    type=gType;
  }
 public static String getType(){
    return type;
  }
}