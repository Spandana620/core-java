class RailwayStation{

  static String stationName;
  static String trainName;
  static int platformNumber;
  static int ticketPrice;
  
   public static void setStationName(String sName){
    stationName=sName;
  }
  public  static String getStationName(){
  return stationName;
  }
  
  public static void setTrainName(String tName){
       trainName=tName;
  }
   public static String getTrainName(){
   return trainName;
  }
   public static void setPlatFormNumber(int tNumber){
       platformNumber=tNumber;
  }
   public static int getPlatFormNumber(){
     return platformNumber;
  }
  public static void setTicketPrice(int tPrice){
    ticketPrice=tPrice;
  }
 public static int getTicketPrice(){
    return ticketPrice;
  }
}